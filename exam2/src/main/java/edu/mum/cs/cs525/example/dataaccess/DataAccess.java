package edu.mum.cs.cs525.example.dataaccess;

import java.util.List;

import edu.mum.cs.cs525.example.entity.Company;
import edu.mum.cs.cs525.example.entity.Employee;
import edu.mum.cs.cs525.example.entity.Manager;
import edu.mum.cs.cs525.example.utils.CompanyUtils;

public class DataAccess {
	private static volatile DataAccess instance;
	
	private Company company;
	
	// Build company
	private DataAccess() {
		company = new Company();
		Manager ceo = CompanyUtils.createRandomManager();
		company.setCEO(ceo);
		
		for(int i = 0; i <3; ++i) {
			ceo.addEmployee(CompanyUtils.createRandomManager());
		}

		int counter = 0;
		do {
			// This will recursively build a tree of employees
			List<Employee> employees = ceo.getEmployees();
			for(Employee e : employees) {
				// Even with as few as 3 iterations, we are going to get a LOT of employees
				for(int i = 0; i <3; ++i) {
					Manager m = (Manager)e;
					m.addEmployee(CompanyUtils.createRandomManager());
				}
			} 
		} while(counter++ < 5);
	}
	
	public static DataAccess getInstance() {
		if(null == instance) {
			synchronized(DataAccess.class) {
				if(null == instance) {
					instance = new DataAccess();
				}
			}
		}
		
		return instance;
	}
	
	public Company getCompany() {
		return company;
	}

}
