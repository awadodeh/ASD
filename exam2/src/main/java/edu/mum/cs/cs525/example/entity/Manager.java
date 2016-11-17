package edu.mum.cs.cs525.example.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import edu.mum.cs.cs525.example.visitor.Visitor;

public class Manager extends Employee implements Consumer<Visitor<Double>> {
	private Double bonus;
	private Double teamBudget;
	
	private List<Employee> employees = new ArrayList<Employee>();

	public Manager(String ssn, String name, Gender gender, LocalDate birthday) {
		super(ssn, name, gender, birthday);
		
		// Default values, use set methods to change these values
		this.bonus = 2 * getSalary();
		this.teamBudget = 10000.0;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public Double getTeamBudget() {
		return teamBudget;
	}

	public void setTeamBudget(Double teamBudget) {
		this.teamBudget = teamBudget;
	}
	
	public boolean addEmployee(Employee e) {
		e.setManager(this);
		
		return employees.add(e);
	}
	
	public boolean isManager() {
		return true;
	}
	
	public List<Employee> getEmployees() {
		List<Employee> allEmployees = new ArrayList<Employee>();
		for(Employee e : employees) {
			allEmployees.add(e);
			if(e.isManager()) {
				Manager m = (Manager)e;
				allEmployees.addAll(m.getEmployees());
			}
		}
		
		return allEmployees;
	}
	
	public Double getTotalTeamSalary() {
		Double totalSalary = 0.0;
		
		totalSalary += this.getSalary();
		for(Employee e : employees) {
			if(e.isManager()) {
				Manager m = (Manager)e;
				totalSalary += m.getTotalTeamSalary();
			}
			else {
				totalSalary += e.getSalary();
			}
		}
		
		return totalSalary;
	}
	
	public Double getAnnualBudget() {
		Double annualBudget = 0.0;
		
		annualBudget += (12 * this.getSalary() + this.getBonus() + this.getTeamBudget());
		for(Employee e : employees) {
			if(e.isManager()) {
				Manager m = (Manager)e;
				annualBudget += m.getAnnualBudget();
			}
			else {
				annualBudget += (12 * e.getSalary());
			}
		}
		
		return annualBudget;
	}
	
	@Override
	public void accept(Visitor<Double> v) {
		v.visit(this);
		for(Employee e : employees) {
			e.accept(v);
		}
	}

}
