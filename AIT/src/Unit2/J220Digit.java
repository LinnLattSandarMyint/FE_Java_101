package Unit2;
import java.util.Scanner;
public class J220Digit {
	public static void main(String[] args) 
	 { 
	 int num; 
	 Scanner input = new Scanner(System.in); 
	 
	 System.out.print("Enter Three Digit Number: "); 
	 num = input.nextInt(); 
	 
	 System.out.println("First Digit\t: " + num/100); 
	 System.out.println("Second Digit\t: " + (num%100)/10); 
	 System.out.println("Third Digit\t: " + (num%100)%10); 
	 }
}
