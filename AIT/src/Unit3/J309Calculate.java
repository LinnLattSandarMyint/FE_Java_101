package Unit3;
import java.io.IOException;
import java.util.Scanner;
public class J309Calculate {
	static Scanner sc=new Scanner(System.in);
public static void main (String args[]) throws Exception {
	int n1,n2;
	char ch;
	System.out.println("Enter first number ");
	n1=sc.nextInt();
	System.out.println("Enter second number ");
	n2=sc.nextInt();
	System.out.println("\n A fot add two integers \n S for sutract second from first \n M for multiply two integers");
	ch=(char) System.in.read();
	 if(ch=='A') 
		 System.out.println("Add two integers : "+(n1+n2));
	 if(ch=='S')
		 System.out.println("Subtract two integers : "+(n1-n2));
	 if(ch=='M')
		 System.out.println("Multiply the two integers : "+(n1*n2));
	 else
		 System.out.println("Your character is invalid !!");
	
}
}
