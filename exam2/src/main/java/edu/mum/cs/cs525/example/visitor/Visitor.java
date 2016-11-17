package edu.mum.cs.cs525.example.visitor;

import java.util.function.Supplier;

import edu.mum.cs.cs525.example.entity.Employee;
import edu.mum.cs.cs525.example.entity.Manager;

public interface Visitor<T> extends Supplier<T> {
	public void visit(Employee e);
	public void visit(Manager m);
}
