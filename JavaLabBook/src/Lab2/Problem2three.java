package Lab2;

class Person{
	private String firstName, lastName;
	private char gender;
	public Person() { //Default Constructor
		super();
	}
	public Person(String firstName, String lastName, char gender) { //Parameterized Constructor
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
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
	@Override
	public String toString() {
		return "Person [firstName = " + firstName + ", lastName = " + lastName
				+ ", gender = " + gender + "]";
	}
}
public class Problem2three {	
	public static void main(String[] args) {
		Person person1 = new Person("Pankush", "Kapoor", 'M');
		System.out.println(person1);
		System.out.println("In Other Format");
		System.out.println("Person Details");
		System.out.println("____________");
		System.out.println();
		System.out.println("First Name: " + person1.getFirstName());
		System.out.println("Last Name: " + person1.getLastName());
		System.out.println("Gender: " + person1.getGender());
	}
}
