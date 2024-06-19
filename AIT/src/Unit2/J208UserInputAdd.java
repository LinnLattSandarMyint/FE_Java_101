package Unit2;
import java.util.Scanner;
public class J208UserInputAdd {
	public static void main(String[] args) 
	 { 
	 int num1, num2; 
	 Scanner sc = new Scanner(System.in); 
	 
	 //Prompt 
	 System.out.print("Enter Num1: "); 
	 num1 = sc.nextInt(); 
	 
	 System.out.print("Enter Num2: "); 
	 num2 = sc.nextInt(); 
	 
	 System.out.print("The Sum is: " + (num1 + num2)); 
	 }
}
