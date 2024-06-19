package Unit4;
import java.util.Scanner;
public class J421PrimeFactor {
	public static void main(String[] args) 
	 { 
	 int num, div = 2; 
	 Scanner input = new Scanner(System.in); 
	 
	 System.out.print("Enter Number: "); 
	 num = input.nextInt(); 
	 
	 while (div <= num) 
	 { 
	 if (num % div == 0) 
	 { 
	 System.out.print(div + ", "); 
	num /= div; 
	 } 
	 else 
	 div++; 
	 } 
	 }
}
