package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLangauges;
	private String[] operatingSystems;
	
	LinkedHashMap<String,String> countryOptions;
	LinkedHashMap<String,String>  favoriteLangage;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("IND", "India");
		countryOptions.put("DN", "Germany");
		countryOptions.put("BRA", "Brazil");
		countryOptions.put("FRA", "France");
		countryOptions.put("US", "United States of America");
		
		favoriteLangage = new LinkedHashMap<>();
		favoriteLangage.put("Java", "Java");
		favoriteLangage.put("C#", "C#");
		favoriteLangage.put("PHP", "PHP");
		favoriteLangage.put("RUBY", "RUBY");
		favoriteLangage.put("SQL", "SQL");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLangauges() {
		return favoriteLangauges;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	/*public String getFavoriteLangauge() {
		return favoriteLangauge;
	}

	public void setFavoriteLangauge(String favoriteLangauge) {
		this.favoriteLangauge = favoriteLangauge;
	}*/
	
	
	
}
