package com.enviro.assement.junior.judas.controller;

import com.enviro.assement.junior.judas.dto.PortfolioResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/portfolio")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // testing
public class PortfolioController {


    @GetMapping("")
    public ResponseEntity<PortfolioResponse> getPortfolio()
    {
        System.out.println("PortfolioController.getPortfolio()");
        return ResponseEntity.ok().build();
    }


}
