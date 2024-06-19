package Unit8;

public class TestPizza {
	public static void main(String[] args) 
	{
	Pizza myPizza = new Pizza();
	myPizza.setToppings("Milk");
	myPizza.setDiameter(10);
	myPizza.setPrice(12.25);
	System.out.println("Topping: " + myPizza.getToppings());
	System.out.println("Diameter: " + myPizza.getDiameter());
	System.out.println("Price: " + myPizza.getPrice());
	}


}
