class Program3 
{
	int a;
	
	Program3()
	{
		System.out.println("This Is Default Constructor");
	}

	Program3(int a)
	{
		this();//Calling Default Constructor
		System.out.println(a);
	}

	public static void main(String args[])
	{
		Program3 oP3 =new Program3(100);
	}

}