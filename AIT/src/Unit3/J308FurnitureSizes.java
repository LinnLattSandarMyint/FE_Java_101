package Unit3;

public class J308FurnitureSizes {
	public static void main(String[] args) throws Exception
	{ 
		 char input, size; 
		 
		 System.out.print("Type P for pine, O for Oak, or M for mahogany: " ); 
		 input = 
		(char)System.in.read();System.in.read();System.in.read(); 
		  System.out.print("Type L for Large Table or S for Small Table: " ); 
		 size = (char)System.in.read(); 
		 
		 if (input == 'P' && size == 'S') 
		 System.out.println("Pine tables cost $100."); 
		 else if (input == 'P' && size== 'L') 
		 System.out.println("Pine tables cost $135."); 
		 else if (input == 'O' && size == 'S') 
		 System.out.println("Oak tables cost $225."); 
		 else if (input == 'O' && size == 'L') 
		 System.out.println("Oak tables cost $260."); 
		 else if (input == 'M' && size == 'S') 
		 System.out.println("Mahogany tables cost $310."); 
		 else if (input == 'M' && size == 'L') 
		 System.out.println("Mahogany tables cost $345."); 
		 else 
		 System.out.println("Your Character is invalid!"); 
		 } 
}
