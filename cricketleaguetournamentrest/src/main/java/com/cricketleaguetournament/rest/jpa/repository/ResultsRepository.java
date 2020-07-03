package com.cricketleaguetournament.rest.jpa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.cricketleaguetournament.rest.dto.ResultsListResponse;
import com.cricketleaguetournament.rest.jpa.enties.Results;

public interface ResultsRepository  extends JpaRepository<Results,Integer>{
	
	@Query("SELECT new com.cricketleaguetournament.rest.dto.ResultsListResponse(r.results_id, c.country_name, r.total_matches, r.won, r.lost,"
			+ " r.tied, r.points, r.qualifynext) FROM Results r INNER JOIN r.country c")
	public List<ResultsListResponse> fetchResultJoin(); 
}
