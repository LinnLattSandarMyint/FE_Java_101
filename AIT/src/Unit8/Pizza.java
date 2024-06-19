package Unit8;

public class Pizza {
	String toppings;
	int diameter;
	double price;
	Pizza()
	{
	toppings = "pepperoni";
	diameter = 12;
	price = 13.99;
	}
	public String getToppings()
	{
	return toppings;
	}
	public void setToppings(String Top)
	{
	toppings = Top;
	}
	public int getDiameter()
	{
	return diameter;
	}
	public void setDiameter(int Dia)
	{
	diameter = Dia;
	}
	public double getPrice()
	{
	return price; }
	public void setPrice(double Pri)
	{
	price = Pri; }
}
