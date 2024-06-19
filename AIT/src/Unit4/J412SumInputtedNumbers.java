package Unit4;
import java.util.Scanner;
public class J412SumInputtedNumbers {
 static Scanner sc=new Scanner (System.in);
 public static void main(String args[]) {
	 int sum=0;
	 int n,count=1;
	 while(count<=5) {
		 System.out.println("Enter num "+count+" : ");
		 n=sc.nextInt();
		 sum+=n;
		 count++;
	 }
	 System.out.println("The result is "+sum);
	 
 }
}
