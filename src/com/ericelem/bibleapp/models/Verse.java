package com.ericelem.bibleapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Verse {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int number;
	private String text;
	
	public Verse() {
	}

	public Verse(int number, String text) {
		this.number = number;
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
