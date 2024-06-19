package Unit2;
import java.util.Scanner;
public class J211ItemToDozenItem {
	public static void main(String[] args) 
	 { 
	 int dozen, item, total; 
	 Scanner input = new Scanner(System.in); 
	 
	 System.out.print("Enter Total Items: "); 
	 total = input.nextInt(); 
	 
	 dozen = total/12; 
	 item = total%12; 
	 System.out.println(dozen + " Dozne " + item + " items" ); 
	 }
}
