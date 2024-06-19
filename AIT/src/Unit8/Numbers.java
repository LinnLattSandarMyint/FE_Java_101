package Unit8;

public class Numbers {
	public static void main(String[] args) 
	{
	int num1 = 25, num2 = 5;
	sum(num1, num2);
	difference(num1, num2);
	}
	public static void sum(int x, int y)
	{
	int sumResult;
	sumResult = x + y;
	System.out.println("The Sum is: " + sumResult);
	}
	public static void difference(int x, int y)
	{
	int difResult;
	difResult = x - y;
	System.out.println("The Difference is: " + difResult);
	}
}
