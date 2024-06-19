package Unit4;
import java.util.Scanner;
public class J409MultiplyUserInput {
  static Scanner sc=new Scanner (System.in);
  public static void main (String args[]) {
	  System.out.println("Enter  a Number : ");
	  int n=sc.nextInt();
	  int i=1;
	  while(i<=12) {
		  int ans=n*i;
		  System.out.println(n+" * "+i+" = "+ans);
		  i++;
	  }
  }
}
