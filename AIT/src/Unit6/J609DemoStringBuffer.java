package Unit6;

public class J609DemoStringBuffer {
  public static void main(String args[]) {
	  StringBuffer str=new StringBuffer("coding");
	  System.out.println(str);
	  str.append("in the room");
	  System.out.println(str);
	  str.insert(0, "studying");
	  System.out.println(str);
	  str.insert(5, "girls");
	  System.out.println(str);
	  str.append("theraphy");
	  System.out.println(str);
  }
}
