package Unit3;
import java.io.IOException; 
import java.util.Scanner; 
public class J318Lawn2 
{ 
 public static void main(String[] args) throws Exception 
 { 
 int length, width, area, weeks = 20, weeklyFee = 1, 
seasonalFee, payment; 
 Scanner input = new Scanner(System.in); 
 
 System.out.print("Enter Length: "); 
 length = input.nextInt(); 
 
 System.out.print("Enter Width: "); 
 width = input.nextInt(); 
 
 area = length * width; 
 System.out.println("\nAnswer\nSquare feet area is: " + area); 
 
 System.out.print("\nPayment Options\nA) once,\nB) twice,\nC) 20 Times\nType: "); 
 payment = (char)System.in.read(); 
 
 if (area > 0 && area <= 400) 
 { 
 weeklyFee = 25; 
 seasonalFee = weeklyFee * weeks; 
 System.out.println("Weekly Fee: " + weeklyFee + " $"); 
 System.out.println("Sesonal Fee: " + seasonalFee + " $"); 
 { 
 if (payment == 'A') 
 System.out.println("The Fee for the season: " + seasonalFee + " $"); 
 if (payment == 'B')
	 System.out.println("The Fee for the 	 season: " + (seasonalFee + 10) + " $"); 
			  if (payment == 'C') 
			  System.out.println("The Fee for the 	 season: " + (seasonalFee + 60) + " $"); 
			  } 
			  } 
			  if (area > 400 && area <= 600) 
			  { 
			  weeklyFee = 35; 
			  seasonalFee = weeklyFee * weeks; 
			  System.out.println("Weekly Fee: " + weeklyFee + " $"); 
			  System.out.println("Sesonal Fee: " + (weeklyFee * 
			 weeks) + " $"); 
			  { 
			  if (payment == 'A') 
			  System.out.println("The Fee for the  season: " + seasonalFee + " $"); 
			  if (payment == 'B') 
			  System.out.println("The Fee for the  season: " + (seasonalFee + 10) + " $");  if (payment == 'C') 
			  System.out.println("The Fee for the season: " + (seasonalFee + 60) + " $"); 
			  } 
			  } 
			  if (area > 600) 
			  { 
			  weeklyFee = 50; 
			  seasonalFee = weeklyFee * weeks; 
			  System.out.println("Weekly Fee: " + weeklyFee + " $"); 
			  System.out.println("Sesonal Fee: " + (weeklyFee * 
			 weeks) + " $"); 
			  { 
			  if (payment == 'A') 
			  System.out.println("The Fee for the  season: " + seasonalFee + " $"); 
			  if (payment == 'B') 
			  System.out.println("The Fee for the	 season: " + (seasonalFee + 10) + " $"); 
			  if (payment == 'C') 
			  System.out.println("The Fee for the 	 season: " + (seasonalFee + 60) + " $"); 
			  } 
			  } 
			  } 
			 } 

