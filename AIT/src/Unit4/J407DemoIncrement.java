package Unit4;

public class J407DemoIncrement {
public static void main(String[] args) {
	int i=10;
	
	
	int plusi=++i;
	int iplus=i++;
	System.out.println(i);
	System.out.println(plusi);
	System.out.println(iplus);
	
	int w=17,x=17,y=18;
	boolean compare1=(++w==y);
	boolean compare2=(x++==y);
	System.out.println("First compare is: " + compare1); 
	 System.out.println("Second compare is: " + compare2); 
	
}
}
