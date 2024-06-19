package Unit7;

public class J714Constructors {
 class Myclass{
	 int x;
	   Myclass(){
		 x=10;
	 }
	   }
 public static void main(String args[]) { 
	 J714Constructors r=new J714Constructors();
 Myclass t1 = r.new Myclass(); 
 Myclass t2 = r.new Myclass(); 
 System.out.println(t1.x + " " + t2.x); 
 }
 }
 
 