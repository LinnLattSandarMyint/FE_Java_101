package Unit3;
import java.util.Scanner;
public class J315PayScale {
	static Scanner sc=new Scanner(System.in);
 public static void main(String args[]) {
	 double hourworked,rate=9,regularpay,totalpay;
	 System.out.println("Enter hours worked : ");
	 hourworked=sc.nextDouble();
	 regularpay=hourworked*rate;
	double overtimepay=(hourworked-40)*1.5*rate;
	if(hourworked<=40) {
		overtimepay=0;
	}else {
		overtimepay=overtimepay;
	}
	 totalpay=regularpay+overtimepay;
	 if(hourworked>40) {
		 System.out.println("Regular pay  is "+regularpay);
		 System.out.println("Overtime pay is "+overtimepay);
		 System.out.println("Total pay is "+totalpay);
	 }else if(hourworked<=40) {
		 System.out.println("Regular pay is "+regularpay);
		 System.out.println("Overtime pay is 0");
		 System.out.println("Total Pay is "+regularpay);
	 }else
		 System.out.println("Your input is invalid!!!");
	 
 }
}
