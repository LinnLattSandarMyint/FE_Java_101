package Unit2;

public class J221Payroll {
 public static void main(String args[]) {
	 int hourlyPayRate =500;
	 int hours=40;
	 double taxtRate= 0.15;
	 int grossPay=hourlyPayRate *hours;
	 double withholdingTax=grossPay*taxtRate;
	 double netPay=grossPay-withholdingTax;
	 System.out.println("Hourly Pay Rate\t: " + hourlyPayRate + "  Kyats"); 
			  System.out.println("One Week Hours\t: " + hours + " Hours"); 
			  System.out.println("Tax Rate\t: " + taxtRate + " // 15 Percent"); 
			  System.out.println("\nAnswer\nGross Pay\t: " + grossPay + "  Kyats"); 
			  System.out.println("Withholding Tax\t: " + withholdingTax + 
			 " Kyats"); 
			  System.out.println("Net Pay\t\t: " + netPay + " Kyats"); 
			  
			  }	
 
}
