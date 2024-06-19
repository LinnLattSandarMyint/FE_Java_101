package Unit4;
import java.util.Scanner;
public class J411WhileLoop13 {
 static Scanner sc=new Scanner (System.in);
  public static void main(String args[]) {
	  int i=0;
	  while(i!=13) {
		  System.out.println("Your number is not 13");
		  System.out.println("Please enter a num ");
		  i=sc.nextInt();
	  }
	  System.out.println("Your number is 13!!!");
  }
}
