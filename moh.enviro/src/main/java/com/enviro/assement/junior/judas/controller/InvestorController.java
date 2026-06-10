package com.enviro.assement.junior.judas.controller;


import com.enviro.assement.junior.judas.dto.InvestorResponse;
import com.enviro.assement.junior.judas.service.InvestorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/investor")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // testing
public class InvestorController {

    @Autowired
    private InvestorService investorService;

    @GetMapping("/{id}")
    public ResponseEntity<InvestorResponse> getInvestorById(@PathVariable Long id)
    {
        InvestorResponse dto = investorService.InvestorById(id);
        System.out.println("Investor.getInvestorById()");
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/{id}/portfolios")
    public ResponseEntity<List<String>> getInvestorPortfolios(@PathVariable Long id)
    {
        System.out.println("Investor.getInvestorPortfolios()");
        return ResponseEntity.ok(investorService.getInvestorPortfolios(id));
    }






}
