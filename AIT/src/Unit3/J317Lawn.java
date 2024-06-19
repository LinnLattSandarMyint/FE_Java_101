package Unit3;
import java.util.Scanner;
public class J317Lawn {
	static Scanner sc=new Scanner (System.in);
	public static void main(String args[]) {
		double length,width,area,weeklyfee,week=20,seasonalfee;
		System.out.println("Enter length : ");
		length=sc.nextDouble();
		System.out.println("Enter width : ");
		width=sc.nextDouble();
		area=length*width;
		System.out.println("Square feet area is "+area);
		if(area>0 && area<=400) {
			weeklyfee=25;
			System.out.println("Weekly fee "+weeklyfee);
			System.out.println("Seasonal fee "+(weeklyfee*week));
		}else if(area>400 && area<600) {
			weeklyfee=35;
			System.out.println("Weekly fee "+weeklyfee);
			System.out.println("Seasonal fee "+(weeklyfee*week));
		}else if(area>=600 ) {
			weeklyfee=50;
			System.out.println("Weekly fee "+weeklyfee);
			System.out.println("Seasonal fee "+(weeklyfee*week));
		}else
			System.out.println("Invalid!!!"); 
	}
}
