package Unit4;
import java.util.Scanner;
public class j418OutOfRange {
 static Scanner sc=new Scanner(System.in);
 public static void main(String args[]) {
	 System.out.println("Enter a number within 1 to 3 ");
	 int n=sc.nextInt();
	 while(n<1 ||n>4) {
		 System.out.println("Out of range");
		 System.out.println("Reenter ");
		 n=sc.nextInt();
	 }
	 System.out.println("You entered number is "+n);
 }
}
