package edu.mum.cs.cs525.example.visitor;

import edu.mum.cs.cs525.example.entity.Employee;
import edu.mum.cs.cs525.example.entity.Manager;

public class TotalSalaryVisitor implements Visitor<Double> {
	private Double totalSalary;

	@Override
	public void visit(Employee e) {
		totalSalary += e.getSalary();
	}

	@Override
	public void visit(Manager m) {
		totalSalary += m.getSalary();
	}

	@Override
	public Double get() {
		return totalSalary;
	}

}
