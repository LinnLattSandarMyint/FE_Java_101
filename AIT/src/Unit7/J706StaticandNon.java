package Unit7;

public class J706StaticandNon {
	static void staticmethod() { 
		 System.out.println("Hey! I am inside a static method. "); 
		 } 
		 public void nonstaticmethod() { 
		 System.out.println("Hey! I am inside a non-static method. I need an 	object to execute myself! "); 
		 } 
		 public static void main(String[] args) { 
		 staticmethod(); 
		 J706StaticandNon ob = new J706StaticandNon(); 
		 ob.nonstaticmethod(); 
		 }
}
