package com.sigelton.org;

public class ObjectSingelton {

	/**
	 * Instead of synchronized variable in Java, you can have java volatile variable,
	 * 	which will instruct JVM threads to read value of volatile variable from main 
	 * 	memory and don't cache it locally. If a variable is not shared between multiple 
	 * 	threads no need to use volatile keyword with that variable.
	 */
	private volatile static ObjectSingelton instance =null;
	
	
	protected ObjectSingelton() {	}
	
	public static ObjectSingelton getInstance(){
		
		if(instance==null)
			
			synchronized(ObjectSingelton.class){
				if(instance==null){
					return new ObjectSingelton();
				}
				
			}
		return instance;
		
	}
	
	
}
