package edu.mum.cs.cs525.example.entity;

public class User extends Person {
	public static final String USER_OBJECT_NAME = "USER";
	
	private String username;

    private Role role;
	
	public User(Person p, String username, Role role) {
		super(p.getSsn(), p.getName(), p.getGender(), p.getBirthday());
		
		this.username = username.toLowerCase();
		this.role = role;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return String.format("User: %s\tRole: %s\t%s", username, role, super.toString());
	}
}
