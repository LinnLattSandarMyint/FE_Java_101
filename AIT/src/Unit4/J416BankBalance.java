package Unit4;
import java.util.Scanner;
public class J416BankBalance {
static Scanner sc=new Scanner (System.in);
public static void main(String args[]) {
	double int_rate=0.03;
	int year=1;
	System.out.println("Enter initial bank balance : ");
	double balance=sc.nextDouble();
	sc.nextLine();
	System.out.println("Do you want to see next year's balance ? ");
	System.out.println("Enter y or n");
	
	String response=sc.nextLine();
	char responseChar=response.charAt(0);
	while(responseChar=='y') {
		balance=balance+balance*int_rate;
		System.out.println("After "+year+"at "+int_rate+" interst rate, balance is $ "+balance);
		
		year+=1;
		System.out.println("Do you want to see next year's balance ? ");
		System.out.println("Enter y or n");
		
		 response=sc.nextLine();
		 responseChar=response.charAt(0);
		 if(responseChar=='n') {
			 System.out.println("Ok Bye !!!");
			 
		 }
	}
	
}
}
