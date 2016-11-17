package edu.mum.cs.cs525.example.service;

import java.util.List;

import edu.mum.cs.cs525.example.dataaccess.DataAccess;
import edu.mum.cs.cs525.example.entity.Company;
import edu.mum.cs.cs525.example.entity.Employee;
import edu.mum.cs.cs525.example.entity.User;

public class CompanyServiceImpl implements CompanyService {
	private DataAccess dao = DataAccess.getInstance();
	private User currentUser = null;
	
	public CompanyServiceImpl() {
	}

	@Override
	public boolean login(User user) {
		setCurrentUser(user);
		return true;
	}

	@Override
	public Company getCompany() {
		return dao.getCompany();
	}

	@Override
	public List<Employee> getEmployeeList() {
		return getCompany().getEmployeeList();
	}

	@Override
	public Double getTotalSalary() {
		return getCompany().getTotalSalary();
	}

	@Override
	public Double getAnnualBudget() {
		return getCompany().getAnnualBudget();
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
}
