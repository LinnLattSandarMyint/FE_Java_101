package Unit2;
import java.util.Scanner;
public class J210DozenItemToItem {

	public static void main(String[] args) 
	 { 
	 int dozen, item, total; 
	 Scanner input = new Scanner(System.in); 
	 
	 System.out.print("Enter Dozen: "); 
	 dozen = input.nextInt(); 
	 
	 System.out.print("Enter Items: "); 
	 item = input.nextInt(); 
	 
	 total = (dozen * 12) + item; 
	 System.out.println(dozen + " Dozne " + item + " items" + " = " + total + " items"); 
	
	 } 
}
