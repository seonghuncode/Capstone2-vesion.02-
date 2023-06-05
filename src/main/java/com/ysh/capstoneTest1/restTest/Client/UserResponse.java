package com.ysh.capstoneTest1.restTest.Client;


//dto!!!


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserResponse {

    private String name;
    private int age;
}

