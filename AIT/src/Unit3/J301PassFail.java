package Unit3;
import java.util.Scanner;
public class J301PassFail {
	 static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		int mark;
		String name;
		
		System.out.println("Enter your mark : ");
		mark =sc.nextInt();
		System.out.println("Enter your name : ");
		name=sc.nextLine();
		if(mark>=40) 
			System.out.println("You pass the exam !!");
		
		if(mark<40) 
			System.out.println("You Fail the exam!!");
		
		
		
		
	}

}
