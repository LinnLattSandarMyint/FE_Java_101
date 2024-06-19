package Unit5;
import java.util.Scanner;
public class J07PizzaChoice2 {
 static Scanner sc=new Scanner (System.in);
 
		public static void main(String args[]) throws Exception {
	 char[] size= {'S','M','L','X'};
	 double[] price= {6.99,8.99,12.5,15.00};
	 System.out.println("Enter Pizza size : ");
	 char s=(char) System.in.read();
	 System.out.println("How many Pizza ? ");
	 int quan=sc.nextInt();
	 for(int i=0;i<4;i++) {
		 if(s==size[i]) {
			 System.out.println("The price for your pizza is "+(price[i]*quan));
		 }
	 }
	 
	 }
 }
