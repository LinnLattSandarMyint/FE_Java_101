package Unit3;
import java.util.Scanner;
public class J316Payroll2 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		double hourlyrate,workedhour,grosspay,netpay,tax;
		
		System.out.println("Enter hourly pay rate : ");
		hourlyrate=sc.nextDouble();
		System.out.println("Enter worked hours : ");
		workedhour=sc.nextDouble();
		
		grosspay=hourlyrate*workedhour;
		if(grosspay>0 && grosspay<=300) {
			 tax=grosspay*0.1;
			netpay=grosspay-tax;
			System.out.println("Gross Pay is "+grosspay);
			System.out.println("Withholding Tax is "+tax);
			System.out.println("Net Pay is "+netpay);
		}else if(grosspay>=300.01 && grosspay<=400) {
			tax=grosspay*0.12;
			netpay=grosspay-tax;
			System.out.println("Gross Pay is "+grosspay);
			System.out.println("Withholding Tax is "+tax);
			System.out.println("Net Pay is "+netpay);

		}else if(grosspay>=400.01 && grosspay<=500) {
			tax=grosspay*0.15;
			netpay=grosspay-tax;
			System.out.println("Gross Pay is "+grosspay);
			System.out.println("Withholding Tax is "+tax);
			System.out.println("Net Pay is "+netpay);

		}else if(grosspay>=500.01 ) {
			tax=grosspay*0.2;
			netpay=grosspay-tax;
			System.out.println("Gross Pay is "+grosspay);
			System.out.println("Withholding Tax is "+tax);
			System.out.println("Net Pay is "+netpay);

		}else
			System.out.println("Your input is invalid!!");
		
	}
}
