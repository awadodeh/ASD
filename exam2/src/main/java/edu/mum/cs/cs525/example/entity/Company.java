package edu.mum.cs.cs525.example.entity;

import java.util.List;
import java.util.function.Consumer;

import edu.mum.cs.cs525.example.visitor.Visitor;

public class Company implements Consumer<Visitor<Double>> {
	private Manager ceo;
	
	public Manager getCEO() {
		return ceo;
	}

	public void setCEO(Manager ceo) {
		this.ceo = ceo;
	}

	public List<Employee> getEmployeeList() {
		return ceo.getEmployees();
	}
	
	public Double getAnnualBudget() {
		return ceo.getAnnualBudget();
	}
	
	public Double getTotalSalary() {
		return ceo.getTotalTeamSalary();
	}
	
	@Override
	public void accept(Visitor<Double> v) {
		ceo.accept(v);
	}

}
