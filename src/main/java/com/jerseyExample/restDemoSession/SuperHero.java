package com.jerseyExample.restDemoSession;

import java.util.List;

public class SuperHero {
	private int id;
	private String name;
	private List<String> superPower;
	private int rating;

	public SuperHero(int id, String name, List<String> superPower, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.superPower = superPower;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSuperPower() {
		return superPower;
	}

	public void setSuperPower(List<String> superPower) {
		this.superPower = superPower;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
