package edu.mum.cs.cs525.example.service;

public class ServiceFactory {
	private static volatile CompanyService companyService;
	
	public static CompanyService createCompanyService() {
		if(null == companyService) {
			synchronized(ServiceFactory.class) {
				if(null == companyService) {
					companyService = new CompanyServiceProxy();
				}
			}
		}
		
		return companyService;
	}

}
