package remote_practice;

public class Light {

	private String name;
	
	public Light() {
		// TODO Auto-generated constructor stub
	}
	
	public Light(String name) {
		this.name=name;
	}
	public void on(){
		System.out.println("Light is On");
	}
	
	public void off(){
		System.out.println("Light is Off");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
