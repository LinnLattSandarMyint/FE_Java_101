package Unit4;
import java.util.Scanner;
public class J415PrimeBreak {
 static Scanner sc=new Scanner(System.in);
 public static void main(String args[]) {
	 System.out.println("Enter a number : ");
	 int n=sc.nextInt();
	 int i=2;
	 int flag=1;
	 while(i<n) {
		 if(n%i==0) {
			 flag=0;
			 break;
		 }else
			 i++;
		 
	 }
	 if(flag==1) {
		 System.out.println(n+" is a prime !!!");
	 }else {
		 System.out.println(n+" is not a prime  !!!");
	 }
 }
}
