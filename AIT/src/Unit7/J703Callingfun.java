package Unit7;
import java.util.Scanner;
public class J703Callingfun {
	public static void announceDeveloperTeaTime() { 
		 System.out.println("Waiting for developer tea time ..."); 
		 System.out.println("Type in a random word and press Enter to start developer tea time."); 
		 Scanner input = new Scanner(System.in); 
		 input.next(); 
		 System.out.println("It's developer tea time!"); 
		 }
	public static void main (String args[]) {
		System.out.println("Welcome to your new job");
		announceDeveloperTeaTime();
		System.out.println("Write Code"); 
		 System.out.println("Review Code"); 
		 
		 announceDeveloperTeaTime();
		 System.out.println("Get promoted!"); 
	 
	}
}
