class Company 
{
	int Eid;

	Company(int id)
	{
		this.Eid=id;
	}
	public boolean equals(Object o)//Upcating
	{
		Company temp=(Company)o;//Downcasting

		if (this.Eid==temp.Eid)
		{
			return true;
		}
		return false;

	}
	public static void main(String[] args) 
	{
		Company e1=new Company(100);
		Company e2=new Company(100);

		System.out.println(e1.equals(e2));
	}
}
