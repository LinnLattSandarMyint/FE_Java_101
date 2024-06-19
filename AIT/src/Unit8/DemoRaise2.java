package Unit8;

public class DemoRaise2 {
	public static void main(String[] args) 
	{
	double mySalary = 200.00;
	double raiseRate = 0.20;
	System.out.println("Demonstrating some raises: ");
	predictRaise(mySalary, raiseRate);
	}
	public static void predictRaise(double moneyAmount, double 
			percentRate)
			{
			double newAmount;
			newAmount = moneyAmount * (1 + percentRate);
			System.out.println("With raise salary is " + newAmount);
			}

}
