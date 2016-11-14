package composite_after;

import java.util.ArrayList;
import java.util.Collection;

public class CompositeDirecotryComponent implements FileSystem{
	
	private String name;
	private Collection<FileSystem> fileList = new ArrayList<FileSystem>();
	
	
	public CompositeDirecotryComponent(String name) {
		this.name = name;
	}

	public void add(FileSystem file){
		
		fileList.add(file);
	}

	
	public int computeSize() {
		int sizeInBytes=0;
		
		for (FileSystem file : fileList){
			
			sizeInBytes+=file.computeSize();
		}
		
		return sizeInBytes;
	}
	
	
	public void print(){
		System.out.println("--file " + name+ " size="+computeSize()+" bytes");
		
		for(FileSystem file: fileList){
			file.print();
		}
	}

}
	
	

