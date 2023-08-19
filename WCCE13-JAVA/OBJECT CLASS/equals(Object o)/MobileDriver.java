class Mobile 
{
	String Name;
	int Ram;

	Mobile(String n,int r)
	{
		this.Name=n;
		this.Ram=r;
	}
	@Override
	public boolean equals(Object o)//Upcasting
	{
		Mobile temp=(Mobile)o;//Downcasting

		if (this.Name==temp.Name && this.Ram==temp.Ram)
		{
			return true;
		}
		return false;

	}
	@Override
	public int hashCode()
	{
		return Ram;
	}
}
class MobileDriver
{
	public static void main(String[] args) 
	{
		Mobile oM=new Mobile("POCO",4);
		Mobile oM1=new Mobile("SAMSUNG",4);
		System.out.println(oM);
		System.out.println(oM1);

		System.out.println(oM==oM1);//false
		System.out.println(oM.equals(oM1));//false

		if (oM.hashCode()==oM1.hashCode())
		{
			System.out.println("Ram Is Same");
			if (oM.equals(oM1))
			{
				System.out.println("Both Mobile Are Same");
			}
			else
			{
				System.out.println("But Mobile Is Different");
			}
		}
		else
		{
			System.out.println("Both Mobile Are Different");
		}
	}
}
