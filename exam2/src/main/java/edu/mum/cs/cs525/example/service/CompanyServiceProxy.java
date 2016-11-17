package edu.mum.cs.cs525.example.service;

import java.util.List;

import edu.mum.cs.cs525.example.entity.Company;
import edu.mum.cs.cs525.example.entity.Employee;
import edu.mum.cs.cs525.example.entity.Role;
import edu.mum.cs.cs525.example.entity.User;

public class CompanyServiceProxy implements CompanyService{

	CompanyServiceImpl companyServiceImpl;
	
	public CompanyServiceProxy() {
		this.companyServiceImpl= new CompanyServiceImpl();
	}
	
	@Override
	public boolean login(User user) {
		return companyServiceImpl.login(user);
	}

	@Override
	public Company getCompany() {
		return companyServiceImpl.getCompany();
	}

	@Override
	public List<Employee> getEmployeeList() {
		return companyServiceImpl.getEmployeeList();
	}

	@Override
	public Double getTotalSalary() throws IllegalAccessException {
		
		if(companyServiceImpl.getCurrentUser().getRole() == Role.ADMIN)
		{
			return companyServiceImpl.getTotalSalary();
		}else{
			throw new IllegalAccessException();
		}
		
	}

	@Override
	public Double getAnnualBudget() throws IllegalAccessException {
		if(companyServiceImpl.getCurrentUser().getRole() == Role.ADMIN)
		{
			return companyServiceImpl.getAnnualBudget();
		}else{
			throw new IllegalAccessException();
		}
	}

	
}
