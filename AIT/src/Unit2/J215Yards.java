package Unit2;

public class J215Yards {
public static void main(String[] args) {
	double length=24, width=42,price=10.5 , area,yard,cost;
	area=length*width;
	yard=area/9.0;
	cost =yard*price;
	System.out.print("Area of carpet \t\t\t= " + area + " Square Feet"+ "\nYard \t\t\t\t= "+ yard + " Square Yard" + "\nCost of carpet per square yard \t= " + cost + " Dollars and Cents");
}
}
