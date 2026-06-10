package com.enviro.assement.junior.judas.service;

import com.enviro.assement.junior.judas.dto.InvestorResponse;
import com.enviro.assement.junior.judas.model.Investor;
import com.enviro.assement.junior.judas.model.Portfolio;
import com.enviro.assement.junior.judas.repository.InvestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class InvestorService {

    @Autowired
    private InvestorRepository  investorRepository;

    public InvestorResponse InvestorById(Long id) {
        Investor investor = investorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        return new InvestorResponse(investor.getId(), investor.getEmail(), investor.getFirstName(), investor.getLastName(), investor.getAge());
    }

    public List<String> getInvestorPortfolios(Long id) {

        Investor investor = investorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));


        return investor.getPortfolios().stream().map(Portfolio::getPortfolioName)
                .collect(Collectors.toList()); // from stream to list -- googled


    }

    public Integer checkInvestorAge( Long id)
        {
        Investor investor = investorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));


            return investor.getAge();

        }

    public boolean allowInvestorWithdrawal(long id) {

        int investorAge = checkInvestorAge(id);

        if(investorAge > 65) {
            //another needed check for balance
            return true;
        }
        else
        {
            System.out.println("Age is not high enough");
            return false;
        }
    }







}
