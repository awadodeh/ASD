package com.sigelton.org2;

import com.sigelton.org.Employee;
import com.sigelton.org.TestObject;
import com.singelton.org2.ObjectSingelton;

/**
* @author Awad 
* This is test class used to create all required objects and use Singleton object to push and
* retrieve value at runtime. You could use the same singleton object from anywhere in your enterprise project
*/

public class SingeltonObjectTest {
	
	static ObjectSingelton instance = ObjectSingelton.getSingeltonInstance();
	
	

	public static void main(String[] args) {
		populateAndSaveDataFromSingletonObject();
		retrieveDataFromSingletonObject();
	}
	
	

	private static void retrieveDataFromSingletonObject() {
		String result = instance.getTestObject();
		System.out.println(result);
	}

	private static void populateAndSaveDataFromSingletonObject() {

		// Create Object
		TestObject obj = new TestObject();
		obj.setName("Awad");
		obj.setAddress("NYC - US");

		// Create Employee1
		Employee emp1 = new Employee();
		emp1.setFirstName("Mike");
		emp1.setLastName("Rose");
		emp1.setPhoneNumber(1222222222);

		// Create Employee2
		Employee emp2 = new Employee();
		emp2.setFirstName("app");
		emp2.setLastName("shah");
		emp2.setPhoneNumber(1333333333);

		// Create Employee3
		Employee emp3 = new Employee();
		emp3.setFirstName("Dexter");
		emp3.setLastName("My");
		emp3.setPhoneNumber(1444444444);

		// Add all Employee Object to ObjectSingelton object
		instance.addEmployee(emp1);
		instance.addEmployee(emp2);
		instance.addEmployee(emp3);

		// Add Employees to obj
		obj.setList(instance.getEmployee());

		// Now finally add obj to same ObjectSingelton object which will use to retrieve all data
		instance.addTestObject(obj);
	}

	

}

