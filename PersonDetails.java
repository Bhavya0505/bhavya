package com.nameverify;

public class PersonDetails {
	
	private Person person;
	private String workTime;
	
	public PersonDetails() {
		// TODO Auto-generated constructor stub
	}

	public PersonDetails(Person person, String workTime) {
		super();
		this.person = person;
		this.workTime = workTime;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getWorkTime() {
		return workTime;
	}

	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

	@Override
	public String toString() {
		return "PersonDetails [person=" + person + ", workTime=" + workTime + "]";
	}
	
	

}
