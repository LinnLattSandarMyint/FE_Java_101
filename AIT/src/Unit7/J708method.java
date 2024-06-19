package Unit7;
import java.util.Scanner;
public class J708method {
	public static void main(String[] args) 
	 { 
	 int x, y, result; 
	 Scanner input = new Scanner(System.in); 
	 
	 System.out.print("Enter First Number: "); 
	 x = input.nextInt(); 
	 System.out.print("Enter Second Number: "); 
	 y = input.nextInt(); 
	 
	 result = minFunction(x,y); 
	 System.out.println("Minimum Number is: " + result); 
	 }
 public static int minFunction(int n1,int n2) {
	 int min;
	 if(n1>n2) 
		 min=n2;
	 else
		 min=n1;
	 return min;
		 
	 
 }
}
