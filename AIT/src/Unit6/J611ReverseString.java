package Unit6;

public class J611ReverseString {
public static void main(String args[]) {
	char a[]= {'h','a','p','p','y','b','i','r','t','h','d','a','y'};
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]);
	}
	System.out.println("\n");
	for(int i=a.length-1;i>=0;i--) {
		System.out.print(a[i]);
	}
}
}
