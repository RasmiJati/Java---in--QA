//Write a program to create a class named "Person", create instance variables rollNumber (int type), 
//name(String), isPresent (as boolean)
//create a function named display() to print name and roll number
//create a function named eligibleForWorkshop() and check if isPresent is true then 
//should print "You are eligible" else "you are not eligible.
//Finally on your main method create class object and call all your functions

package Assignment2;

public class Person {

	int rollNumber = 1;
	String name = "Rasmi";
	boolean isPresent = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person();
		obj.display();
		obj.eligibleForWorkshop();
	}

	public void display() {
		System.out.println("Name : " + name + " \t" + " Roll Number : " + rollNumber);
	}

	public void eligibleForWorkshop() {
		if (isPresent) {
			System.out.println(name + ", You are eligible ");
		} else {
			System.out.println(name + ", You are not eligible ");

		}
	}

}
