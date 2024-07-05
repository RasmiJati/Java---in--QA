package StudentInfoRetrivingSystem;

public class Student {

	int studentId;
	String name;
	double averageMarks;
	double totalMarksObtained[] = { 700, 800, 900, 1000 };

	public Student() {

	}

	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	public void display() {
		System.out.print("Student Id : " + studentId + "\t " + "Name : " + name + " \t ");
	}

	public void average() {
		double sum = totalMarksObtained[0] + totalMarksObtained[1] + totalMarksObtained[2] + totalMarksObtained[3];
		averageMarks = sum / 4.0;
		System.out.println(" \t Average Marks : " +averageMarks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student(1,"Rasmi");
		student.display();
		student.average();
		
	}

}
