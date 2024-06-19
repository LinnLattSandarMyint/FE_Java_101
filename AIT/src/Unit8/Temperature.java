package Unit8;

public class Temperature {
	public static void main(String[] args) 
	{
	double cent = 37, fah = 98.6;
	FtoC (fah);
	CtoF (cent);
	}
	public static void FtoC (double F)
	{
	double C;
	C = (F-32) * (5.0/9);
	System.out.println("Centigrade Degree: " + C);
	}
	public static void CtoF (double C)
	{
	double F;
	F = (9*C)/5 + 32;
	System.out.println("Fahrenheit Degree: " + F);
}}
