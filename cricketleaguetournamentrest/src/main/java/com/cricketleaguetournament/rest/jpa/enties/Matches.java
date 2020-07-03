package com.cricketleaguetournament.rest.jpa.enties;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Matches{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int match_id;
	@CreationTimestamp
	private Date match_date;
	private String win_type;
	private int win_margin;
	private String outcome_type;
	@ManyToOne
	@JoinColumn(name = "venue_id")
	private Venue venue;	
	@ManyToOne
	@JoinColumn(name = "match_winner")
	private Country country_mw;
	@ManyToOne
	@JoinColumn(name = "man_of_the_match")
	private Player matches_mm;
	@ManyToOne
	@JoinColumn(name = "match_format_id")
	private MatchFormats matchformats;
	@ManyToOne
	@JoinColumn(name = "team_1")
	private Country country_t1;
	@ManyToOne
	@JoinColumn(name = "team_2")
	private Country country_t2;

	public Matches() {
	}

	public int getMatch_id() {
		return match_id;
	}

	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}

	public Date getMatch_date() {
		return match_date;
	}

	public void setMatch_date(Date match_date) {
		this.match_date = match_date;
	}

	public String getWin_type() {
		return win_type;
	}

	public void setWin_type(String win_type) {
		this.win_type = win_type;
	}

	public int getWin_margin() {
		return win_margin;
	}

	public void setWin_margin(int win_margin) {
		this.win_margin = win_margin;
	}

	public String getOutcome_type() {
		return outcome_type;
	}

	public void setOutcome_type(String outcome_type) {
		this.outcome_type = outcome_type;
	}

	public Country getCountry_mw() {
		return country_mw;
	}

	public void setCountry_mw(Country country_mw) {
		this.country_mw = country_mw;
	}

	public Player getMatches_mm() {
		return matches_mm;
	}

	public void setMatches_mm(Player matches_mm) {
		this.matches_mm = matches_mm;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public MatchFormats getMatchformats() {
		return matchformats;
	}

	public void setMatchformats(MatchFormats matchformats) {
		this.matchformats = matchformats;
	}

	public Country getCountry_t1() {
		return country_t1;
	}

	public void setCountry_t1(Country country_t1) {
		this.country_t1 = country_t1;
	}

	public Country getCountry_t2() {
		return country_t2;
	}

	public void setCountry_t2(Country country_t2) {
		this.country_t2 = country_t2;
	}

}
