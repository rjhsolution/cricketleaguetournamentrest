package com.cricketleaguetournament.rest.jpa.enties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MatchFormats{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int format_id;
	private String format_name;
	
	public MatchFormats() {
		super();
	}

	public int getFormat_id() {
		return format_id;
	}

	public void setFormat_id(int format_id) {
		this.format_id = format_id;
	}

	public String getFormat_name() {
		return format_name;
	}

	public void setFormat_name(String format_name) {
		this.format_name = format_name;
	}


	
	
}
