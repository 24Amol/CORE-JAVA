class Employee 
{
	int iEmpID=0;
	String strName="";
	double dSal=0.0;
	
	Employee(int id,String n,double sal)
	{
		iEmpID=id;
		strName=n;
		dSal=sal;
	}

	void display()
	{
		System.out.println("The Employee Name Is:"+strName);
		System.out.println("The Employee Id IS:"+iEmpID);
		System.out.println("The Employee Salary Is:"+dSal);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
