package Unit8;

public class Tempature2 {
	public static void main(String[] args) 
	{
	double cent = 37, fah = 98.6;
	Fahclass.FtoC (fah);
	CtoF (cent);
	}
	public static void CtoF (double C)
	{
	double F;
	F = (9*C)/5 + 32;
	System.out.println("Fahrenheit Degree: " + F);
	}
}
