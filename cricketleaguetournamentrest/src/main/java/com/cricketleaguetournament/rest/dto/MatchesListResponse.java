package com.cricketleaguetournament.rest.dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MatchesListResponse {
	
	private int match_id;
	private String match_date;
	private String outcome_type;
	private int win_margin;
	private String win_type;
	private String venue;
	private String match_winner;
	private String man_of_the_match;
	private String match_formate;
	private String team_1;
	private String team_2;
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	
	public MatchesListResponse() {
	}

	public MatchesListResponse(int match_id, Date match_date, String outcome_type, int win_margin, String win_type,
			String venue, String match_winner, String man_of_the_match, String match_formate, String team_1,
			String team_2) {
		super();
		this.match_id = match_id;
		this.match_date = dateFormat.format(match_date);
		this.outcome_type = outcome_type;
		this.win_margin = win_margin;
		this.win_type = win_type;
		this.venue = venue;
		this.match_winner = match_winner;
		this.man_of_the_match = man_of_the_match;
		this.match_formate = match_formate;
		this.team_1 = team_1;
		this.team_2 = team_2;
	}

	public int getMatch_id() {
		return match_id;
	}

	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}

	public String getMatch_date() {
		return match_date;
	}

	public void setMatch_date(Date match_date) {
		this.match_date = dateFormat.format(match_date);
	}

	public String getOutcome_type() {
		return outcome_type;
	}

	public void setOutcome_type(String outcome_type) {
		this.outcome_type = outcome_type;
	}

	public int getWin_margin() {
		return win_margin;
	}

	public void setWin_margin(int win_margin) {
		this.win_margin = win_margin;
	}

	public String getWin_type() {
		return win_type;
	}

	public void setWin_type(String win_type) {
		this.win_type = win_type;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getMatch_winner() {
		return match_winner;
	}

	public void setMatch_winner(String match_winner) {
		this.match_winner = match_winner;
	}

	public String getMan_of_the_match() {
		return man_of_the_match;
	}

	public void setMan_of_the_match(String man_of_the_match) {
		this.man_of_the_match = man_of_the_match;
	}

	public String getMatch_formate() {
		return match_formate;
	}

	public void setMatch_formate(String match_formate) {
		this.match_formate = match_formate;
	}

	public String getTeam_1() {
		return team_1;
	}

	public void setTeam_1(String team_1) {
		this.team_1 = team_1;
	}

	public String getTeam_2() {
		return team_2;
	}

	public void setTeam_2(String team_2) {
		this.team_2 = team_2;
	}

	@Override
	public String toString() {
		return "MatchesListResponse [match_id=" + match_id + ", match_date=" + dateFormat.format(match_date) + ", outcome_type="
				+ outcome_type + ", win_margin=" + win_margin + ", win_type=" + win_type + ", venue=" + venue
				+ ", match_winner=" + match_winner + ", man_of_the_match=" + man_of_the_match + ", match_formate="
				+ match_formate + ", team_1=" + team_1 + ", team_2=" + team_2 + "]";
	}
	
	
	
}
