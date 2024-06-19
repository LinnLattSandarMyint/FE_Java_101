package Unit6;

public class J610DemoStringBuffer2 {
public static void main(String args[]) {
	StringBuffer str=new StringBuffer("Happy ");
	str.append("Birthday");
	System.out.println(str);
	str.insert(6, "17th");
	System.out.println(str);
	str.setCharAt(7,'8');
	System.out.println(str);
}
}
