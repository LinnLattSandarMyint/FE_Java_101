package Unit7;

public class J719Salarycalculator {
	public static double salaryCalculatorProgram(double hoursPerWeek, 
			 
			double amountPerHour, 
			 
			int vacationDays) { 
			 
			 if (hoursPerWeek < 0) { 
			 return -1; 
			 } 
			 
			 if (amountPerHour < 0) { 
			 return -1; 
			 } 
			 
			 double weeklyPaycheck = hoursPerWeek * amountPerHour; 
			 double unpaidTime = amountPerHour * 8; 
			 return (weeklyPaycheck * 52) - unpaidTime; 
			 } 
			 
			 public static void main(String[] args) { 
			 double salary= salaryCalculatorProgram(40.0, 15.0, 8); 
			 System.out.println(salary); 
			 
			 }
}
