package Unit8;

public class stu {
	public static void main(String[] args) {
		StudentProfile profileOne = new StudentProfile("Shine Wai", 
		"Aung","MBA", 3.75, 2022);
		StudentProfile profileTwo = new StudentProfile("Pyae Sone", 
		"Aung", "Computer Science", 3.45, 2023);
		profileOne.incrementExpectedGraduationYear();
		System.out.println(profileOne.expectedYearToGraduate);
		profileTwo.incrementExpectedGraduationYear();
		System.out.println(profileTwo.expectedYearToGraduate);
		}
}
