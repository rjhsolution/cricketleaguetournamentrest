package com.cricketleaguetournament.rest.jpa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.cricketleaguetournament.rest.dto.MatchesListResponse;
import com.cricketleaguetournament.rest.jpa.enties.Matches;
 
public interface MatchesRepository extends JpaRepository<Matches,Integer>{
	  
	@Query("SELECT new com.cricketleaguetournament.rest.dto.MatchesListResponse(m.match_id, m.match_date, m.outcome_type, m.win_margin, m.win_type,"
			+ " v.venue_name, cmw.country_name, mmm.player_name,mf.format_name, ct1.country_name, ct2.country_name) FROM Matches m INNER JOIN m.venue v "
			+ "INNER JOIN m.country_mw cmw INNER JOIN m.matches_mm mmm INNER JOIN m.matchformats mf INNER JOIN m.country_t1 ct1 INNER JOIN m.country_t2 ct2")
	public List<MatchesListResponse> fetchMatchesListJoin();
} 
