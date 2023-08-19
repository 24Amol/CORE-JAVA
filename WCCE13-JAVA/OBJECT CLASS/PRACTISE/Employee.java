class Employee 
{
	int Eid;
	String fName;
	String lName;
	String dob;
	long mobile;
	String email;

	Employee(int id,String fname,String lname,String dob,long mobile,String email)
	{
		this.Eid=id;
		this.fName=fname;
		this.lName=lname;
		this.dob=dob;
		this.mobile=mobile;
		this.email=email;
	}
	@Override
	public String toString()
	{
		return"\nID : "+ Eid+"\nFirst Name : " +fName+"\nLast Name : " +lName+"\nDOB : " +dob+"\nMobile : " +mobile+"\nEmail : "+email;
	}
	
	public static void main(String[] args) 
	{
		Employee employee=new Employee(01,"Amol","Pawar","24-April-2000",9373428581l,"24amolpawar@gmail.com");
		System.out.println("************** Employee Details ************");
		System.out.println(employee.toString());


	}
}
