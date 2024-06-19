package Unit8;

public class ModifiedEmployee {
	private int empNum;
	private double empSalary;
	ModifiedEmployee()
	{
	empNum = 999;
	empSalary = 300.00;
	}
	public int getEmpNum()
	{
	return empNum;
	}
	public void setEmpNum(int num)
	{
	empNum = num;
	}
	public double getEmpSal()
	{
	return empSalary;
	}
	public void setEmpSal(double sal)
	{
	empSalary = sal;
	}
}
