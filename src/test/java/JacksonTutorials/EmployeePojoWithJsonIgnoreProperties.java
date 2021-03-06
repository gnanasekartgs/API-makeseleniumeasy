package JacksonTutorials;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"gender","fullName"}, allowGetters = true )
public class EmployeePojoWithJsonIgnoreProperties {

	// private variables or data members of pojo class
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private double salary;
	private boolean married;
	
	private String fullName;
	private boolean eligibleForVote;
	
	// Getter and setter methods
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean getMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	} 
	
	public String getFullName() {
		return this.fullName;
	}
	public boolean getEligibleForVote() {
		return this.eligibleForVote;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setEligibleForVote(boolean eligibleForVote) {
		this.eligibleForVote = eligibleForVote;
	}
	
	
}

