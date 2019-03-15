package com.ericelem.bibleapp.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Bible {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private String code;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "bible_testaments")
	private List<Testament> testaments;

	public Bible() {
		super();
	}

	public Bible(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Testament> getTestaments() {
		return testaments;
	}

	public void setTestaments(List<Testament> testaments) {
		this.testaments = testaments;
	}

}
