class Book 
{
	String name;
	int pages;

	Book(String name,int p)
	{
		this.name=name;
		this.pages=p;
	}
	@Override
	public boolean equals (Object o)//Upcasting
	{
		Book temp=(Book)o;//Downcasting
		
		if (this.name==temp.name && this.pages==temp.pages)
		{
			return true;
		}
		return false;
	}

	public int hashCode()
	{
		return pages;
	}
	
	public static void main(String[] args) 
	{
		Book oB=new Book("Java",1000);
		Book oB1=new Book("Java",100);

		System.out.println(oB==oB1);//false
		System.out.println(oB.equals(oB1));//true

		if (oB.hashCode()==oB1.hashCode())
		{
			if (oB.equals(oB1))
			{
				System.out.println("Both Objects Are Same");
			}
			else
			{
				System.out.println("Both Objects Are Not Same");
			}
		}
		else
		{
			System.out.println("Both Objects Are Not Equal");
		}
	}
}
