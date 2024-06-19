package Unit4;
import java.util.Scanner;
public class J420FactorNumber {
 static Scanner sc=new Scanner(System.in);
 public static void main(String args[]) {
	 System.out.println("Enter a number ");
	 int n=sc.nextInt();
	 System.out.print("The possible factor numbers are ");
	 for(int i=1;i<=n;i++) {
		 if(n%i==0) {
			 System.out.print(i+"\t");
		 }
	 }
 }
}
