package Models;

public class User {
	String username;
	String email;
	String password;
	String role;
	boolean isAuthenticated = false;
	
	
	public User(String str, String password, String role) {
		if (str.contains("@")) {
			this.email = str;
			this.username = null;
		} else {
			this.username = str;
			this.email = null;
		}
		this.password = password;
		this.role = role;
	}
	
	public User(String username, String email, String password, String role) {
		if (username != null) {
			this.username = username;
		}
		this.email = email;
		this.password = password;
		this.role = role; // toLowercase()?
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public void printUser() {
		System.out.println(this.username);
		System.out.println(this.email);
		System.out.println(this.password);
		System.out.println(this.role);
		System.out.println();
	}	
	
}