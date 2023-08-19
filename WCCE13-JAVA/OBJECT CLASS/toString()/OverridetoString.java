class OverridetoString
{
	//Ns-Variable
	int Eid;

	OverridetoString(int n)
	{
		this.Eid=n;
	}
	
	public String toString()
	{
		return "TCS"+Eid;
	}

	public static void main(String[] args) 
	{
		OverridetoString oVS=new OverridetoString(100);
		System.out.println(oVS);

		
		OverridetoString oVS1=new OverridetoString(101);
		System.out.println(oVS1);

	}
}
