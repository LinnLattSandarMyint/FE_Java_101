package Unit6;

public class J608StringBuffer {
	public static void main (String args[]){
	{ 
		 StringBuffer eventString = new StringBuffer("AIT Computer"); 
		 int aCapacity = eventString.capacity(); 
		 System.out.println("The capacity is " + aCapacity); 
		 StringBuffer philosophyString = null; 
		 philosophyString = new StringBuffer("AIT Online Training 	Website"); 
		 int bCapacity = philosophyString.capacity(); 
		 System.out.println("The capacity is " + bCapacity); 
		 eventString.setLength(50); 
		 System.out.println("The eventString is " + eventString + " 	end"); 
		 philosophyString.setLength(30); 
		 System.out.println("The philosophyString is " + philosophyString + "end");
		 } 
}}
