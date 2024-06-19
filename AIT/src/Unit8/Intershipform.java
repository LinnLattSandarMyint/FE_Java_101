package Unit8;

public class Intershipform {
	 String name;
	 int Age;
	 String Gender;
	 Intershipform(String name,int Age,String Gender){
		 this.name=name;
		 this.Age=Age;
		 this.Gender=Gender;
	 }
	 public static void main(String args[]) {
		 Intershipform obj1=new Intershipform("Lin Lin",20,"Female");
		 Intershipform obj2=new Intershipform("Naing Phyo Wai",22,"Male");
		 System.out.println("Name : "+obj1.name);
		 System.out.println("Age: " + obj1.Age);
		 System.out.println("Gender: "+obj1.Gender);
		 System.out.println("Name: " + obj2.name);
		 System.out.println("Age: " + obj2.Age);
		 System.out.println("Gender: "+obj2.Gender);
	 }
}
