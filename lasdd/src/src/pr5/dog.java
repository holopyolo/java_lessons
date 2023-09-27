package src.pr5;

public class dog {
private String name;
private int age;

public dog(String name, int age){
	this.setAge(age);
	this.setName(name);
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String ToString() {
	return "Name: " + this.name + "\nAge(compare with human's age): " + (this.age * 7);
}

}
