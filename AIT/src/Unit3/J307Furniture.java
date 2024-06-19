package Unit3;

import java.io.IOException;

public class J307Furniture {
public static void main(String args[]) throws Exception {
	char input;
	System.out.println("Type P for pine ,O for Oak, or M for mahogany: ");
	input= (char)System.in.read();
	if (input == 'P') 
		 System.out.println("Pine tables cost $100."); 
		 else if (input == 'O') 
		 System.out.println("Oak tables cost $225."); 
		 else if (input == 'M') 
		 System.out.println("Mahogany tables cost $310."); 
		 else 
		 System.out.println("Your Character is invalid!");
}
}
