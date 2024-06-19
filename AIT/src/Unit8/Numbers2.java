package Unit8;

public class Numbers2 {
	public static void main(String[] args) 
	{
	int num1 = 25, num2 = 5, pro;
	sum(num1, num2);
	difference(num1, num2);
	pro = product(num1, num2);
	System.out.println("The Product is: " + pro);
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
	public static int product(int x, int y)
	{
	int proResult;
	proResult = x * y;
	return proResult;
	}

}
