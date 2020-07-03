package com.cricketleaguetournament.rest.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cricketleaguetournament.rest.jpa.enties.Country;

public interface CountryRepository extends JpaRepository<Country,Integer>{

}
