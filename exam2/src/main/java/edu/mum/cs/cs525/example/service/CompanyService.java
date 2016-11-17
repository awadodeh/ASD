package edu.mum.cs.cs525.example.service;

import java.util.List;

import edu.mum.cs.cs525.example.entity.Company;
import edu.mum.cs.cs525.example.entity.Employee;
import edu.mum.cs.cs525.example.entity.User;

public interface CompanyService {
	public boolean login(User user);
	public Company getCompany();
	public List<Employee> getEmployeeList();
	public Double getTotalSalary() throws IllegalAccessException;
	public Double getAnnualBudget() throws IllegalAccessException;
}
