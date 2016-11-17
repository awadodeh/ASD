package edu.mum.cs.cs525.example.entity;

import java.time.LocalDate;
import java.util.function.Consumer;

import edu.mum.cs.cs525.example.visitor.Visitor;

public class Employee extends Person implements Consumer<Visitor<Double>> {
	private LocalDate startDate;
	
	private Double salary;
	private String position;
	
	private Manager manager;
	
	public Employee(String ssn, String name, Gender gender, LocalDate birthday) {
		super(ssn, name, gender, birthday);
		
		// Default Values
		this.startDate = LocalDate.now();
		this.salary = 4500.0;
		this.position = "Employee";
		this.manager = null; // No manager
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	public boolean isManager() {
		return false;
	}

	@Override
	public void accept(Visitor<Double> v) {
		v.visit(this);
	}
	
}
