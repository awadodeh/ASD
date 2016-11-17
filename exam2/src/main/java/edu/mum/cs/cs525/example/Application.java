package edu.mum.cs.cs525.example;

import java.util.List;

import edu.mum.cs.cs525.example.entity.Employee;
import edu.mum.cs.cs525.example.entity.Role;
import edu.mum.cs.cs525.example.entity.User;
import edu.mum.cs.cs525.example.service.CompanyService;
import edu.mum.cs.cs525.example.service.ServiceFactory;
import edu.mum.cs.cs525.example.utils.CompanyUtils;

public class Application {

	public static void main(String[] args) throws IllegalAccessException {
		User user = CompanyUtils.createRandomUser();
		
		user.setRole(Role.ADMIN);

		CompanyService service = ServiceFactory.createCompanyService();
		service.login(user);

		List<Employee> employees = service.getEmployeeList();
		System.out.println("Total number of employees in this company: " + employees.size());

		Double totalSalary = service.getTotalSalary();
		System.out.printf("Total salary paid this month to all employees is: $%,10.2f\n", totalSalary);

		Double totalBudget = service.getAnnualBudget();
		System.out.printf("This company has an annual budget of: $%,15.2f\n", totalBudget);
	}

}
