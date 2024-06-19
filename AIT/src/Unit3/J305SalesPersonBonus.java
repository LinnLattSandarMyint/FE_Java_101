package Unit3;
import java.util.Scanner;
public class J305SalesPersonBonus {
	public static void main(String[] args) 
	 { 
	  
	 int items, total; 
	 Scanner input = new Scanner(System.in); 
	 
	 
	 System.out.print("How many sell items?: "); 
	 items = input.nextInt(); 
	 System.out.print("How much total money?: "); 
	 total = input.nextInt(); 
	 
	 if (items >= 3 && total >= 1000) 
	 System.out.println("Give 50$ Bonus."); 
	 else 
	 System.out.println("Don't Give Bonus."); 
	 }
}
