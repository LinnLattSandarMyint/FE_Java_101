package Unit3;
import java.util.Scanner;
public class J303NegativeZeroPositive {
	 public static void main (String args[]) {
		 int n;
		 Scanner sc=new Scanner (System.in);
		 System.out.println("Enter a number ");
		 n=sc.nextInt();
		 if (n>0)
			 System.out.println("Positive");
		 else if(n<0)
			 System.out.println("Negative");
		 else
			 System.out.println("Zero");
	 }
}
