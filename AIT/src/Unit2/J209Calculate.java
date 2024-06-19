package Unit2;
import java.util.Scanner;
public class J209Calculate {
	public static void main(String[] args) 
	 { 
	 int num1, num2; 
	 Scanner input = new Scanner(System.in); 
	 
	 System.out.print("Enter First Number: "); 
	 num1 = input.nextInt(); 
	 
	 System.out.print("Enter Second Number: "); 
	 num2 = input.nextInt(); 
	 
	 System.out.println("\nThe Sum is: " + (num1 + num2)); 
	 System.out.println("The Sub is: " + (num1 - num2)); 
	 System.out.println("The Multiply is: " + (num1 * num2)); 
	 System.out.println("The Dividend is: " + (num1 / num2)); 
	 System.out.println("The Reminder is: " + (num1 % num2)); 
	 
	 }
}
