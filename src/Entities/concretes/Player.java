package Entities.concretes;

import java.time.LocalDate;

import Entities.abstracts.Entity;

public class Player implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirthDate;
	private String nationalityId;
	private String level = "1";
	
	public Player() {
		
	}
	
	public Player(int id, String firstName, String lastName, LocalDate dateOfBirthDate, 
			String nationalityId,
			String level) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirthDate = dateOfBirthDate;
		this.nationalityId = nationalityId;
		this.level = level;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public LocalDate getDateOfBirthDate() {
		return dateOfBirthDate;
	}
	public void setDateOfBirthDate(LocalDate dateOfBirthDate) {
		this.dateOfBirthDate = dateOfBirthDate;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

}
