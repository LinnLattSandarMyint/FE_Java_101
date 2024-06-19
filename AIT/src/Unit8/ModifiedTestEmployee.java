package Unit8;

public class ModifiedTestEmployee {
	public static void main(String[] args) 
	{
	ModifiedEmployee mySelf = new ModifiedEmployee();
	System.out.println("Employee no.\t: " + 
	mySelf.getEmpNum());
	System.out.println("Salary\t\t: " + mySelf.getEmpSal());
	mySelf.setEmpNum(1);
	mySelf.setEmpSal(10000);
	System.out.println("Employee no.\t: " + 
	mySelf.getEmpNum());
	System.out.println("Salary\t\t: " + mySelf.getEmpSal());
	}

}
