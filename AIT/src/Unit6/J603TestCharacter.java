package Unit6;

public class J603TestCharacter {
	public static void main(String[] args) throws Exception 
	 { 
	 char aChar; 
	 System.out.print("Please enter a character: "); 
	 aChar = 
	(char)System.in.read();System.in.read();System.in.read(); 
	 
	 if(Character.isDigit(aChar)) 
	 System.out.println(aChar + " is a number"); 
	 else 
	 System.out.println(aChar + " is not a number"); 
	 
	 
	 if(Character.isWhitespace(aChar)) 
	 System.out.println("Character is a whitespace character"); 
	 else 
	 System.out.println("Character is not a whitespace	character"); 
	 
	 if(Character.isLetter(aChar)) 
	 if(Character.isLowerCase(aChar)) 
	 System.out.println(aChar + " is lowercase character"); 
	 else 
	 System.out.println(aChar + " is not a lowercase character"); 
	 }
}
