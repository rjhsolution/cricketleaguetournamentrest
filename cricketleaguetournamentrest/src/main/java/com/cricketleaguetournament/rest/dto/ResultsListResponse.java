package com.cricketleaguetournament.rest.dto;

public class ResultsListResponse {
	private int results_id;
	private String country_name;
	private int total_matches;
	private int won;
	private int lost;
	private int tied;
	private int points;
	private String qualifynext;
	public ResultsListResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResultsListResponse(int results_id, String country_name, int total_matches, int won, int lost, int tied,
			int points, String qualifynext) {
		super();
		this.results_id = results_id;
		this.country_name = country_name;
		this.total_matches = total_matches;
		this.won = won;
		this.lost = lost;
		this.tied = tied;
		this.points = points;
		this.qualifynext = qualifynext;
	}
	public int getResults_id() {
		return results_id;
	}
	public void setResults_id(int results_id) {
		this.results_id = results_id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
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
	public String getQualifynext() {
		return qualifynext;
	}
	public void setQualifynext(String qualifynext) {
		this.qualifynext = qualifynext;
	}
	
}
