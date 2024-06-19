package Unit8;

public class StudentProfile {
	String firstName;
	String lastName;
	String declareMajor;
	double gpa;
	int expectedYearToGraduate;
	public StudentProfile(String firstName, String lastName, 
	 String declareMajor, double gpa, 
	 int expectedYearToGraduate) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.declareMajor = declareMajor;
	this.gpa = gpa;
	this.expectedYearToGraduate = expectedYearToGraduate;
	}
	public void incrementExpectedGraduationYear() {
	this.expectedYearToGraduate += 1;
	}

}
