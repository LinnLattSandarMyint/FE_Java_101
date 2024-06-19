package Unit3;

public class J311ChooseManager {
	public static void main(String[] args) throws Exception 
	 { 
	 char eventType; 
	 
	 System.out.println("Enter type of event you are scheduling"); 
	 System.out.println("C for a corporate event"); 
	 System.out.println("P for private event"); 
	 System.out.println("Enter Choice: "); 
	 
	 eventType = (char)System.in.read(); 
	 
	 System.out.print("The manager for this event will be"); 
	 
	 if (eventType == 'C') 
	 System.out.println(" Dustin Britt"); 
	 else 
	 System.out.println(" Carmen Lindsey"); 
	 }
}
