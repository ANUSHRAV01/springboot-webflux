package com.anushravtech.springbootwebflux.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {


    private int id;
    private String name;

}
