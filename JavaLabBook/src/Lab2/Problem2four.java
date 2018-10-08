package Lab2;

import java.util.Scanner;

class Person1{
	private String firstName, lastName;
	private char gender;
	private int mNumber;
	public Person1
	() { //Default Constructor
		super();
	}
	public Person1(String firstName, String lastName, char gender, int mNumber) { //Parameterized Constructor
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mNumber = mNumber;
	}
	//Getters and Setters
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getmNumber() {
		return mNumber;
	}
	public void setmNumber(int mNumber) {
		this.mNumber = mNumber;
	}
	@Override
	public String toString() {
		return "Person1 [firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", mNumber=" + mNumber + "]";
	}	
}
public class Problem2four {	
	public static void main(String[] args) {
		System.out.println("Enter Phone number: ");
		Scanner ref = new Scanner(System.in);
		int number = ref.nextInt();
		Person1 person1 = new Person1("Pankush", "Kapoor", 'M', number);
		System.out.println("Details : "+person1);
		ref.close();
		System.out.println("Displaying Person's Details");
		System.out.println("Person Details");
		System.out.println("____________");
		System.out.println();
		System.out.println("First Name: " + person1.getFirstName());
		System.out.println("Last Name: " + person1.getLastName());
		System.out.println("Gender: " + person1.getGender());
	}
}
