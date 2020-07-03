package com.cricketleaguetournament.rest.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cricketleaguetournament.rest.jpa.enties.Venue;

public interface VenueRepository extends JpaRepository<Venue,Integer> {

}
