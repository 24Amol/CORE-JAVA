class Student 
{
	String strName;
	String strDob;
	private double strFee;

	public void study()
	{
		System.out.println(this.strName+":Is Good In Java");
	}

	public double getStFee()
	{
		return strFee;
	}
	public void setStFee(double fee)
	{
		this.strFee=fee;
	}
	
	public void stDetails()
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
