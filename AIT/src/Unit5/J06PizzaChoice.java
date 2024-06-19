package Unit5;

import java.io.IOException;

public class J06PizzaChoice {
	public static void main(String args[]) throws Exception {
 char[] size= {'S','M','L','X'};
 double[] price= {6.99,8.99,12.5,15.00};
 System.out.println("Enter Pizza size : ");
 char s=(char) System.in.read();
 
 for(int i=0;i<4;i++) {
	 if(s==size[i]) {
		 System.out.println("The price for your pizza is "+price[i]);
	 }
 }
 
 }
 
}
