package composite_after;

import java.util.ArrayList;
import java.util.Collection;

/**
 * We really dont need this class anymore since we got more general class 
 * 	CompositeDirecotryComponent {@link CompositeDirecotryComponent}
 * @author Awad
 *
 */
public class Drive implements FileSystem {
	protected String name;	
	protected Collection<CompositeDirecotryComponent> compositeList = new ArrayList<CompositeDirecotryComponent>();
	
	public Drive(String name) { 
		this.name = name;
	}
	
	public void add(CompositeDirecotryComponent file){
		compositeList.add(file);
	}
	

	public int computeSize(){ 
		int sizeInBytes=0;
		
		for (CompositeDirecotryComponent file : compositeList){
			sizeInBytes+=file.computeSize();
		}
		return sizeInBytes;
	}
	
	
	public void print(){
		System.out.println("- drive "+name);
		for (CompositeDirecotryComponent dir : compositeList){
			
			dir.print();
		}
	}
}