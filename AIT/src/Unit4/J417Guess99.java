package Unit4;
import java.util.Scanner;
public class J417Guess99 {
	static Scanner sc=new Scanner(System.in);
	
 public static void main(String args[]) {
	 int flag=1;
	 int guess=777;
	 do {
	 System.out.println("Guess my secret integer number :: ");
	 int n=sc.nextInt();
	 if(n==guess) {
		 System.out.println("Your number is correct !!!");
		 flag=0;
	 }else {
		 System.out.println("Your number was wrong !!!");
	 }
	 }while(flag==1);
 }
}
