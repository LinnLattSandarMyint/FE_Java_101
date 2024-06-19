package Unit5;
import java.util.Scanner;
public class J04ArrayMatch {
 static Scanner sc=new Scanner(System.in);
 public static void main(String args[]) {
	 int[] validvalues= {101,108,201,213,266,304,311,409,411,412};
	 double[] prices= { 0.89,1.23,3.50,0.69,5.79,3.19,0.99,0.89,1.26,8.00};
	 System.out.println("Enter Item ordered : ");
	 int order=sc.nextInt();
	 boolean flag=false;
	 
	 for(int i=0;i<10;i++) {
		 if(order==validvalues[i]) {
			 System.out.println("Price :: "+prices[i]);
			 flag=true;
		 }
	 }
			 if(flag==false) {
				 System.out.println("Invalid ordered item !!!");
			 }
 }
}
