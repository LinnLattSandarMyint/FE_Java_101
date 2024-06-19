package Unit5;
import java.io.IOException;
import java.util.Scanner;
public class J09VowelArray {
 static Scanner sc=new Scanner (System.in);
 public static void main(String args[]) throws Exception {
	 char[] vowels= {'a','e','i','o','u'};
	 boolean flag=false;
	 System.out.println("Enter the a character : ");
	 char c=(char) System.in.read();
	 for(int i=0;i<vowels.length;i++) {
		 if(vowels[i]==c) {
			 flag=true;
		 }
	 }
	 if (flag==false) {
		 System.out.println("The entered char is not a vowel");
	 }
 }
}
