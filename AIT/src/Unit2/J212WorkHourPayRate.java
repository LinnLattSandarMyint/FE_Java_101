package Unit2;
import java.util.Scanner;
public class J212WorkHourPayRate {
	public static void main(String[] args) 
	 { 
	 int workDays, workHours, payRate, weeklyPay; 
	 workDays = 5; 
	 Scanner input = new Scanner(System.in); 
	 
	 System.out.print("Enter Hourly Pay Rate: "); 
	 payRate = input.nextInt(); 
	 
	 System.out.print("Enter Work Hours: "); 
	 workHours = input.nextInt(); 
	 
	 weeklyPay = workDays * workHours * payRate; 
	 System.out.print("Weekly Pay is: " + weeklyPay); 
	 } 

}
