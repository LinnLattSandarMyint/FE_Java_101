package Unit7;

public class J715class2 {
 class MyClass2{
	 int x;
	 MyClass2(int i){
		 x=i;
	 }
 }
 public static void main(String args[]) { 
	 J715class2 r=new J715class2();
	 MyClass2 t1 = r.new MyClass2( 10 ); 
	 MyClass2 t2 = r.new MyClass2( 20 ); 
	 System.out.println(t1.x + " " + t2.x); 
	 } 
}
 