class CallNsMeCon 
{
	String Name;
	String CName;
	String Dob;

	public void getData()
	{
		String name="Amol";
		String cName="FTC Sangola";
		String dob="24 Apr 2000";

		this.Name=name;
		this.CName=cName;
		this.Dob=dob;
	}
	public void display(long lfee)
	{
		getData();
		System.out.println(Name);
		System.out.println(CName);
		System.out.println(Dob);	
		System.out.println("College Fee:-"+lfee);
	}

	CallNsMeCon()
	{
		display(50000);
		this.display(467532);
	}

	CallNsMeCon(String n,String cName,String dob)
	{
		this.Name=n;
		this.CName=cName;
		this.Dob=dob;
		display(50000);
		this.display(467532);
		
		System.out.println(Name);
		System.out.println(CName);
		System.out.println(Dob);
	}

	
	public static void main(String[] args) 
	{
		CallNsMeCon ob=new CallNsMeCon("Sagar","ABC","35 Jan 2000");

	}
}
