package Unit3;
import java.util.Scanner;
public class J304PassFailIfElse {
	public static void main(String[] args) 
	 { 
	 
	 int mark; 
	
	 Scanner input = new Scanner(System.in); 
	 
	
	 System.out.print("Enter your Mark: "); 
	 mark = input.nextInt(); 
	 
	
	 if (mark >= 40) 
	 System.out.print("You Pass the Exam!"); 
	 else 
	 System.out.print("You Fail the Exam!"); 
	 }
}
