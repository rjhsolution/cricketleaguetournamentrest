package com.cricketleaguetournament.rest.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cricketleaguetournament.rest.jpa.enties.Team;

public interface TeamRepository  extends JpaRepository<Team,Integer> {

}
