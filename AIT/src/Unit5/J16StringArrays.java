package Unit5;
import java.util.Arrays;
public class J16StringArrays {
	public static void main(String[] args) 
	 { 
	 String[] aryString = {"This", "is", "a", "string", "array"}; 
	 int i; 
	 
	 for (i = 0; i < aryString.length; i++) 
	 System.out.println(aryString[i]); 
	 
	 Arrays.sort(aryString); 
	 
	 System.out.println("\nAfter Sorting String: "); 
	 
	 for (i = 0; i < aryString.length; i++) 
	 System.out.println(aryString[i]); 
	 
	 }
}
