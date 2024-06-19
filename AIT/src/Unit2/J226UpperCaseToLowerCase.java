package Unit2;

import java.io.IOException;

public class J226UpperCaseToLowerCase {
 public static void main (String args[]) throws Exception {
	 char input;
	 System.out.println("Enter Upper Case Character :");
	 input = (char)(System.in.read()+32);
	 System.out.println("Convert to Lower Case = "+ input);
 }
}
