package Unit3;
import java.util.Scanner; 
public class J319Pay 
{ 
 public static void main(String[] args) 
 { 
 double hourlyPayRate; 
 int workedHours; 
 double overtime; 
 Scanner input = new Scanner(System.in); 
 
 System.out.print("Choice Hourly Pay Rate: \na) 7.00 \nb) 10.00 \nc) 12.00 \nEnter: "); 
 hourlyPayRate = input.nextDouble(); 
 System.out.print("Choice Worked Hours: \na) 40 Hours \nb) 45Hours \nc) 50 Hours \nEnter: "); 
 workedHours = input.nextInt(); 
 
 System.out.println("The Worked Hours\t\t: " + workedHours); 
 System.out.println("The Hourly Pay Rate\t\t: " + 
hourlyPayRate); 
 System.out.println("The Regular Pay for 40 Hours\t: " + 
(hourlyPayRate * 40)); 
 overtime = (workedHours - 40) * (hourlyPayRate * 2); 
 System.out.println("The Overtime Pay\t\t: " + overtime); 
 } 
} 