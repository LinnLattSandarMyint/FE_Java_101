package Unit8;

public class Employee3 {
	public String name;
	
	private double salary;
	
	public Employee3 (String empName){
	name = empName;
	}
	
	public void setSalary(double empSal){
	salary = empSal;
	}
	
	public void printEmp(){
	System.out.println("name : " + name );
	System.out.println("salary :" + salary);
	}
	public static void main(String args[]){
	Employee3 empOne = new Employee3("Ransika");
	empOne.setSalary(1000);
	empOne.printEmp();
	}
}
