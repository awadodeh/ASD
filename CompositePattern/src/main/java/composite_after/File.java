package composite_after;

public class File implements FileSystem{
	
	private String name;
	private int sizeInBytes;
	
	public File(String name, int sizeInBytes) {
		this.name= name;
		this.sizeInBytes = sizeInBytes;
	}
	
	public void print(){
		System.out.println("--file " + name+ " size="+getSizeInBytes()+" bytes");
	}

	public int computeSize() {
		return sizeInBytes;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSizeInBytes(int sizeInBytes) {
		this.sizeInBytes = sizeInBytes;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSizeInBytes() {
		return sizeInBytes;
	}
}
