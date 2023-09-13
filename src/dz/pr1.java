package dz;

public class pr1 {
	private String name;
	private String email;
	private char gender;
	
	public pr1(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.name;
	}
	public char getGender() {
		return this.gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return "Name: " + this.name + "\nemail: " + this.email +
			   "\nGender: " + this.gender;
	}
	
}

