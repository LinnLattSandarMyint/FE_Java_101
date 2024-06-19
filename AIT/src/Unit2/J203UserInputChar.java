package Unit2;

import java.io.IOException;

public class J203UserInputChar {
public static void main(String args[]) throws Exception {
	char ch;
	int i;
	System.out.println("Enter a character : ");
	ch = (char) System.in.read();
	i =(int)ch;
	System.out.println("The Character you entered is: " + ch);
	 System.out.println("The Integer Value for char: " + i);
}
}
