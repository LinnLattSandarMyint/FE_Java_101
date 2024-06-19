package Unit3;
import java.util.Scanner;
public class J312MonthTest {
public static void main(String args[]) {
	String month;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter a Month : ");
	month=sc.nextLine();
	switch(month)
	{
	case "September":
	case "April":
	case "June":
	case "November":
		System.out.println("Days =30");
		break;
	case "February":
		System.out.println("Days = 29");
		break;
	default: System.out.print("Days=31");
	}
}
}
