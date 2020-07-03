/**
 * 
 */
package com.cricketleaguetournament.rest.jpa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cricketleaguetournament.rest.dto.MatchesListResponse;
import com.cricketleaguetournament.rest.dto.PlayerListResponse;
import com.cricketleaguetournament.rest.dto.ResultsListResponse;
import com.cricketleaguetournament.rest.jpa.repository.MatchesRepository;
import com.cricketleaguetournament.rest.jpa.repository.PlayerRepository;
import com.cricketleaguetournament.rest.jpa.repository.ResultsRepository;

/**
 * @author Ramjeet
 *
 */ 
@RestController
@CrossOrigin(origins = "*")
public class RequestController {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@Autowired
	private MatchesRepository matchesRepository;
	
	@Autowired
	private ResultsRepository resultsRepository;
	
	@GetMapping("/listofplayers")
	public List<PlayerListResponse> listOfPlayers(){
		return playerRepository.fetchPlayerListJoin();

	}
	
	@GetMapping("/listofmatches")
	public List<MatchesListResponse> listOfMatches(){
		return matchesRepository.fetchMatchesListJoin();
		
	}
	
	@GetMapping("/listofresult")
	public List<ResultsListResponse> listOfResults(){
		return resultsRepository.fetchResultJoin();
		
	}
}
