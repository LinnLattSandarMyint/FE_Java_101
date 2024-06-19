package Unit2;
import java.util.Scanner;
public class J213MileToKiloMeter {
	public static void main(String[] args) 
	 { 
	 int mile; 
	 float km; 
	 Scanner input = new Scanner(System.in); 
	 
	 System.out.print("Enter Mile: "); 
	 mile = input.nextInt(); 
	 
	 km = (float)(mile * 1.609344); 
	 System.out.print("KiloMeter is: " + km); 
	 }
}
