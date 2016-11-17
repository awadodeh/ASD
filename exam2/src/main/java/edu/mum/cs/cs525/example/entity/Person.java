package edu.mum.cs.cs525.example.entity;

import java.time.LocalDate;

public class Person implements Comparable<Person> {
	private String ssn;
	private String name;
	private Gender gender;
	private LocalDate birthday;
	private String emailAddress;
    
	public Person(String ssn, String name, Gender gender, LocalDate birthday) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.emailAddress = name + "@abc.com";
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public int getAge() {
		return LocalDate.now().getYear() - birthday.getYear();
	}
	
	public void printPerson() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return String.format("SSN: %s\tName: %s\tGender: %s\tBirthday: %s", ssn, name, gender, birthday);
	}

	@Override
	public int compareTo(Person other) {
		if(null == other) {
			return 1; // "this" is bigger than null
		}
		
		return this.ssn.compareTo(other.ssn);
	}
}