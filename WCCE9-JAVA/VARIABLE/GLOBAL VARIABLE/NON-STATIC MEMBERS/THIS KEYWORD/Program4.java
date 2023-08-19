class Program4 
{
	int a;
	
	Program4()
	{
		this(100);
		System.out.println("This Is Default Constructor");
	}

	Program4(int a)
	{
		System.out.println("This Is Parameterized Constructor");
	}

	public static void main(String args[])
	{
		Program4 oP4 =new Program4();
	}

}