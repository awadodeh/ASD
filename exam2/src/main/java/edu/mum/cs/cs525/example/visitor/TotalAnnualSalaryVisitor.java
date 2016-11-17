package edu.mum.cs.cs525.example.visitor;

import edu.mum.cs.cs525.example.entity.Employee;
import edu.mum.cs.cs525.example.entity.Manager;

public class TotalAnnualSalaryVisitor implements Visitor<Double> {

	private Double totalSalary = 0.0;

	@Override
	public void visit(Employee e) {
		totalSalary += (12 * e.getSalary());
	}

	@Override
	public void visit(Manager m) {
		totalSalary += (12 * m.getSalary() + m.getBonus());
	}
	
	public void add(Double value) {
		totalSalary += value;
	}

	@Override
	public Double get() {
		return totalSalary;
	}

}
