package com.enviro.assement.junior.judas.dto;

import lombok.Getter;

@Getter
public class InvestorResponse {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;

    public InvestorResponse(Long id, String email, String firstName, String lastName) {

    }


    public InvestorResponse(Long id, String email, String firstName, String lastName, Integer age) {

    }
}
