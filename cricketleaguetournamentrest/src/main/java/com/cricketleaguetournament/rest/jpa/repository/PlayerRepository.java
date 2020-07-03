package com.cricketleaguetournament.rest.jpa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.cricketleaguetournament.rest.dto.PlayerListResponse;
import com.cricketleaguetournament.rest.jpa.enties.Player;

public interface PlayerRepository extends JpaRepository<Player,Integer>{
	
	@Query("SELECT new com.cricketleaguetournament.rest.dto.PlayerListResponse(p.player_id, p.player_name, p.dob, p.batting_hand, p.bowling_skill,"
			+ " p.add_info, c.country_name, t.team_name, p.play_team) FROM Player p INNER JOIN p.country c INNER JOIN p.team t")
	public List<PlayerListResponse> fetchPlayerListJoin(); 
} 
