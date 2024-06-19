package Unit4;
import java.util.Scanner;
public class j419Factorial {
 static Scanner sc=new Scanner(System.in);
 public static void main(String args[]) {
	 System.out.println("Enter  a number ");
	 int n=sc.nextInt();
	 int sum=0;
	 for(int i=n;i>=1;i--) {
		 sum+=i;
	 }
	 System.out.println(n+"! = "+sum);
 }
}
