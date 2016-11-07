package com.singelton.org2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.sigelton.org.Employee;
import com.sigelton.org.TestObject;

public class ObjectSingelton {

	private List<Employee> employees = new ArrayList<Employee>();
	private volatile static ObjectSingelton instance=null;
	private TestObject object = new TestObject();
	
	public static ObjectSingelton getSingeltonInstance(){
		
		if (instance == null) {
			instance = new ObjectSingelton();
		}
		return instance;
	}
	
	
	public void addEmployee(Employee employee) {
		synchronized (employees) {
			employees.add(employee);
		}
	}
 
	public List<Employee> getEmployee() {
		return employees;
	}
 
	public void addTestObject(TestObject testObject) {
		synchronized (testObject) {
			this.object = testObject;
		}
	}
 
	public String getTestObject() {
		JSONObject obj = new JSONObject();
		obj.put("name", object.getName());
		obj.put("address", object.getAddress());
 
		JSONArray employeeJson = new JSONArray();
		for (Employee emp : employees) {
 
			Map<String, String> employeeData = new HashMap<String, String>();
			employeeData.put("firstName", emp.getFirstName());
			employeeData.put("lastName", emp.getLastName());
			employeeData.put("phoneNumber", emp.getPhoneNumber() + "");
 
			employeeJson.put(employeeData);
		}
		obj.put("employees", employeeJson);
		return obj.toString();
	}
	
	
	
	
}
