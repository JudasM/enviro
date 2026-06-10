package com.enviro.assement.junior.judas.dto;

import lombok.Getter;

@Getter
public class PortfolioResponse {

    private Long  id;
    private String portfolioName;
    private Double portfolioValue;

    public PortfolioResponse(Long id, String portfolioName, Double portfolioValue) {}
}
