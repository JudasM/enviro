package com.enviro.assement.junior.judas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.apachecommons.CommonsLog;

import java.time.LocalDateTime;



@Entity
@Setter
@Getter
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @Column(unique = true) // Not sure if I want to make the name unique
    private String portfolioName;

    @Column
    private LocalDateTime createdDate;

    @Column
    private Double portfolioValue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "investor_id", nullable = false)
    private Investor investor;


    public Double CalculatePortfolioValue()
    {
        return portfolioValue;
    }

    // not sure what this will do -- adding cause of the UML
//    public void getPerformance ()
//    {
//
//    }


}
