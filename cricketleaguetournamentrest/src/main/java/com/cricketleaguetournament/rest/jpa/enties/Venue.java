package com.cricketleaguetournament.rest.jpa.enties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venue{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int venue_id;
	private String venue_name;

	public Venue() {
	}

	public int getVenue_id() {
		return venue_id;
	}

	public void setVenue_id(int venue_id) {
		this.venue_id = venue_id;
	}

	public String getVenue_name() {
		return venue_name;
	}

	public void setVenue_name(String venue_name) {
		this.venue_name = venue_name;
	}
	

}
