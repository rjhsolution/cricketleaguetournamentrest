package com.cricketleaguetournament.rest.dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PlayerListResponse {
	
	private int player_id;
	private String player_name;
	private String dob;
	private String batting_hand;
	private String bowling_skill;
	private String add_info;
	private String country_name;
	private String group_name;
	private String play_team;
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	public PlayerListResponse() {
	}


	public PlayerListResponse(int player_id, String player_name, Date dob, String batting_hand, String bowling_skill,
			String add_info, String country_name, String group_name, String play_team) {
		super();
		this.player_id = player_id;
		this.player_name = player_name;
		this.dob = dateFormat.format(dob);
		this.batting_hand = batting_hand;
		this.bowling_skill = bowling_skill;
		this.add_info = add_info;
		this.country_name = country_name;
		this.group_name = group_name;
		this.play_team = play_team;
	}


	public String getPlay_team() {
		return play_team; 
	}


	public void setPlay_team(String play_team) {
		this.play_team = play_team;
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

	public String getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dateFormat.format(dob);
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

	public String getAdd_info() {
		return add_info;
	}

	public void setAdd_info(String add_info) {
		this.add_info = add_info;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_id) {
		this.country_name = country_id;
	}

	public String getGroup_name() {
		return group_name;
	}


	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}


	@Override
	public String toString() {
		return "PlayerListResponse [player_id=" + player_id + ", player_name=" + player_name + ", dob=" + dateFormat.format(dob)
				+ ", batting_hand=" + batting_hand + ", bowling_skill=" + bowling_skill + ", add_info=" + add_info
				+ ", country_name=" + country_name + "]";
	}
	
	
}
