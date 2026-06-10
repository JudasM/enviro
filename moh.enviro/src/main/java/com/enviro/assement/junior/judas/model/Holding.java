package com.enviro.assement.junior.judas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Holding {

    @Id
    private Long holdingId;

    @Column
    private Integer quantity; // Making it an int, cause my assumption is that Quantity is a number.

    @Column
    private Double averagePrice;

    public Double CalculateValue()
    {

         return  0.0;
    }
}
