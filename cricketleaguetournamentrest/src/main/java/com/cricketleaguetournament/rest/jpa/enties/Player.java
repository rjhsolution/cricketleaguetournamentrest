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
public class Player{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int player_id;
	private String player_name;
	@CreationTimestamp
	private Date dob;
	private String batting_hand;
	private String bowling_skill;
	private String play_team;
	private String add_info;
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	@ManyToOne
	@JoinColumn(name = "team_id")
	private Team team;

	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getBatting_hand() {
		return batting_hand;
	}
	public void setBatting_hand(String batting_hand) {
		this.batting_hand = batting_hand;
	}
	public String getBowling_skill() {
		return bowling_skill;
	}
	public void setBowling_skill(String bowling_skill) {
		this.bowling_skill = bowling_skill;
	}
	public String getPlay_team() {
		return play_team;
	}
	public void setPlay_team(String play_team) {
		this.play_team = play_team;
	}
	public String getAdd_info() {
		return add_info;
	}
	public void setAdd_info(String add_info) {
		this.add_info = add_info;
	}
	
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Player() {
	}
	
}
