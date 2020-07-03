package com.cricketleaguetournament.rest.jpa.enties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Results {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int results_id;
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	private int total_matches;
	private int won;
	private int lost;
	private int tied;
	private int points;
	private String qualifynext;
	public Results() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getQualifynext() {
		return qualifynext;
	}
	public void setQualifynext(String qualifynext) {
		this.qualifynext = qualifynext;
	}
	public int getResults_id() {
		return results_id;
	}
	public void setResults_id(int results_id) {
		this.results_id = results_id;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public int getTotal_matches() {
		return total_matches;
	}
	public void setTotal_matches(int total_matches) {
		this.total_matches = total_matches;
	}
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
	public int getLost() {
		return lost;
	}
	public void setLost(int lost) {
		this.lost = lost;
	}
	public int getTied() {
		return tied;
	}
	public void setTied(int tied) {
		this.tied = tied;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}

}
