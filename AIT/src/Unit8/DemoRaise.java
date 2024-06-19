package Unit8;

public class DemoRaise {
	public static void main(String[] args) 
	{
	double mySalary = 200.00;
	System.out.println("Demonstrating some raises: ");
	predictRaise(400.00);
	predictRaise(mySalary);
	}
	public static void predictRaise(double moneyAmount)
	{
	double newAmount;
	newAmount = moneyAmount * 1.10;
	System.out.println("With raise salary is " + newAmount);
	}

}
