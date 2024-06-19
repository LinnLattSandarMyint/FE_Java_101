package Unit3;

import java.io.IOException;

public class J314PetAdvice {
	
public static void main(String args[]) throws Exception {
	 
		 char live, time; 
		 
		 System.out.print("Type you live \nA for apartment, \nH for House, \nD for dormitory \nType: "); 
		 live = 
		(char)System.in.read();System.in.read();System.in.read(); 
		 
		 System.out.print("Type time \nA)18 or more \nB)10 to 17 \nC)8 	to 9 \nD)6 to 7 \nE)0 to 5 \nType: "); 
		 time = (char)System.in.read(); 
		 if (live == 'H' && time == 'A') 
		 System.out.println("Pit Recommendation is: Pot bellied 	pig."); 
		 else if (live == 'H' && time == 'B') 
		 System.out.println("Pit Recommendation is: Dog."); 
		 else if (live == 'H' && (time == 'C' || time == 'D' || time 
		== 'E')) 
		 System.out.println("Pit Recommendation is: Snake."); 
		 else if (live == 'A' && (time == 'A' || time == 'B')) 
		 System.out.println("Pit Recommendation is: Cat."); 
		 else if (live == 'A' && (time == 'C' || time == 'D' || time 
		== 'E')) 
		 System.out.println("Pit Recommendation is: Hamster."); 
		 else if (live == 'D' && (time == 'A' || time == 'B' || time 
		== 'C' || time == 'D')) 
		 System.out.println("Pit Recommendation is: Fish."); 
		 else if (live == 'D' && time == 'E') 
		 System.out.println("Pit Recommendation is: Ant 	Farm."); 
		 else 
		 System.out.println("You type invalid character."); 
		 }
}
