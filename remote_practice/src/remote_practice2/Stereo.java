package remote_practice2;

public class Stereo {

	private String name;
	
	public Stereo() {
		// TODO Auto-generated constructor stub
	}
	
	public Stereo(String name) {
		this.name=name;
	}
	
	public void on(){
		System.out.println("Stereo On");
	}
	
	public void off(){
		
		System.out.println("Stereo off");
		
	}
	
	public void setCd(){
		System.out.println("Stereo setCD");
		
		
	}
	
	
	public void setDvd(){
		
	}
	
	public void setRadio(){
		
	}

	public void setVolume(int n){
		
		System.out.println("Stereo setVolume: " + n);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
