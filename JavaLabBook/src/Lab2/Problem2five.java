package Lab2;

class Person2{
	private String firstName, lastName;
	private Gender gender;
	private int mNumber;
	public Person2
	() { //Default Constructor
		super();
	}
	public Person2(String firstName, String lastName, Gender gender, int mNumber) { //Parameterized Constructor
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mNumber = mNumber;
	}
	enum Gender{
		M,F;
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
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
public class Problem2five {	
	public static void main(String[] args) {
		
		Person2 person2 = new Person2("Pankush", "Kapoor", Person2.Gender.M, 981566);
		System.out.println("Details : "+person2);
		System.out.println("Displaying Person's Details");
		System.out.println("Person Details");
		System.out.println("____________");
		System.out.println();
		System.out.println("First Name: " + person2.getFirstName());
		System.out.println("Last Name: " + person2.getLastName());
		System.out.println("Gender: " + person2.getGender());
	}
}
