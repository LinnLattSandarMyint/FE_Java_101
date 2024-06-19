package Unit2;

public class J217SecondToHMS {
	public static void main(String[] args) 
	 { 
	 int second = 10000, hours, minutes, seconds; 
	 hours = second/3600; 
	 minutes = (second%3600)/60; 
	 seconds = (second%3600)%60; 
	 System.out.println(" 10000 Seconds = " + hours + " Hours " + 
	minutes +" Minutes " + seconds + " Seconds"); 
	 }
}
