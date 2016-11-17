package edu.mum.cs.cs525.example.service;

import java.util.List;

import edu.mum.cs.cs525.example.entity.Company;
import edu.mum.cs.cs525.example.entity.Employee;
import edu.mum.cs.cs525.example.entity.Role;
import edu.mum.cs.cs525.example.entity.User;

public class CompanyServiceProxy implements CompanyService{

	CompanyServiceImpl companyServiceImpl;
	private LogService logService;
	
	public CompanyServiceProxy() {
		this.companyServiceImpl= new CompanyServiceImpl();
		this.logService = new LogServiceImpl();
	}
	
	@Override
	public boolean login(User user) {
		
		logService.logMethod("Login");
		return companyServiceImpl.login(user);
	}

	@Override
	public Company getCompany() {
		logService.logMethod("getCompany");
		return companyServiceImpl.getCompany();
	}

	@Override
	public List<Employee> getEmployeeList() {
		logService.logMethod("getEmployeeList");

		return companyServiceImpl.getEmployeeList();
	}

	@Override
	public Double getTotalSalary() throws IllegalAccessException {
		logService.logMethod("getTotalSalary");

		if(companyServiceImpl.getCurrentUser().getRole() == Role.ADMIN)
		{
			return companyServiceImpl.getTotalSalary();
		}else{
			throw new IllegalAccessException();
		}
		
	}

	@Override
	public Double getAnnualBudget() throws IllegalAccessException {
		logService.logMethod("getAnnualBudget");

		if(companyServiceImpl.getCurrentUser().getRole() == Role.ADMIN)
		{
			return companyServiceImpl.getAnnualBudget();
		}else{
			throw new IllegalAccessException();
		}
	}

	public CompanyServiceImpl getCompanyServiceImpl() {
		return companyServiceImpl;
	}

	public void setCompanyServiceImpl(CompanyServiceImpl companyServiceImpl) {
		this.companyServiceImpl = companyServiceImpl;
	}

	public LogService getLogService() {
		return logService;
	}

	public void setLogService(LogService logService) {
		this.logService = logService;
	}

	
}
