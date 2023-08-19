class Student 
{
	private String strName;
	private String strDob;
	private double strFee;

	//Private Members Are Accesible Only That Class Only 
	//Private Member Are Not Accessible For Outside Class
	//Inside That Class We Can Modify The Private Membes

	public void display()
	{
		System.out.println(this.strName+": Is Good In Java");
	}

	public void getData()
	{
		System.out.println(this.strName);
		System.out.println(this.strDob);
		System.out.println(this.strFee);
	}

	Student(String name,String dob,double fee)
	{
		this.strName=name;
		this.strDob=dob;
		this.strFee=fee;
	}
}


