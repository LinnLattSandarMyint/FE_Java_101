package Unit3;

public class J313VowelTest {
	public static void main(String[] args) throws Exception 
	 { 
	
	 char ch; 
	 
	 System.out.print("Enter a Character: "); 
	 ch = (char)System.in.read(); 
	 
	 /*if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch 
	== 'u') 
	 System.out.print("Vowel"); 
	 else 
	 System.out.print("Consonent");*/ 
	 switch(ch) 
	 { 
	 case 'a': System.out.print("Vowel"); break; 
	 case 'e': System.out.print("Vowel"); break; 
	 case 'i': System.out.print("Vowel"); break; 
	 case 'o': System.out.print("Vowel"); break; 
	 case 'u': System.out.print("Vowel"); break; 
	 default: System.out.print("Consonent"); 
	 } 
	 }
}
