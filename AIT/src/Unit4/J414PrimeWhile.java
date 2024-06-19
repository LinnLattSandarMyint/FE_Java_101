package Unit4;
import java.util.Scanner;
public class J414PrimeWhile {
static Scanner sc=new Scanner(System.in);
public static void main(String args[]) {
	int n;
	System.out.println("Enter a number : ");
	 n=sc.nextInt();
	 int i=2;
	while(n%i!=0 && i<=n) {
		i++;
	}
	if(n==i) {
		System.out.println(n+" is a prime number ");
	}else {
		System.out.println(n+" is not a prime number ");}
}
}
