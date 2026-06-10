package com.enviro.assement.junior.judas.repository;

import com.enviro.assement.junior.judas.model.Investor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestorRepository extends JpaRepository<Investor, Long> {

}
