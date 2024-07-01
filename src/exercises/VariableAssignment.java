
//		2 local variable name , rollnumber
//		1 static class/variable = 1011
//		1 instance variable

package exercises;

public class VariableAssignment {

	static int serialNumber = 1011; // static variable
	int age = 10; // instance variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariableAssignment variableAssignment = new VariableAssignment();
		String name = "Rasmi Jati"; // local variable
		int rollNumber = 1; // local variable

		System.out.print("Name : " + name + ", Roll number : " + rollNumber);
		System.out.print(", SerialNumber: " + VariableAssignment.serialNumber);
		variableAssignment.display();
	}

	public void display() {
		System.out.print(", Age : " + age);
	}
}