package com.anushravtech.springbootwebflux.router;

import com.anushravtech.springbootwebflux.handler.CustomerHandler;
import com.anushravtech.springbootwebflux.handler.CustomerStreamHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfig {

    @Autowired
    private CustomerHandler handler;

    @Autowired
    private CustomerStreamHandler customerStreamHandler;


    @Bean
    public RouterFunction<ServerResponse> routerFunction(CustomerHandler handler) {
        return RouterFunctions.route()
                .GET("/router/customers", RequestPredicates.accept(MediaType.APPLICATION_JSON), handler::loadCustomer)
                .GET("/router/customers/stream",handler::loadCustomer)
                .GET("/router/customer/{input}",handler::findCustomer)
                .POST("/router/customer/save",handler::saveCustomer)
                .build();
    }
}
