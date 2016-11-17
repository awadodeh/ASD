package edu.mum.cs.cs525.example.visitor;

import edu.mum.cs.cs525.example.entity.Manager;

public class TotalAnnualBudgetVisitor extends TotalAnnualSalaryVisitor {
	
	@Override
	public void visit(Manager m) {
		super.visit(m);
		add(m.getTeamBudget());
	}
}
