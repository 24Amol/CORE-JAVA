class P4 
{
	static int a=10;
	int b=20;

	public static void demo()
	{
		P4 oP=new P4();
		System.out.println(oP.b);
		System.out.println("Static-Method");
	}
	public void test()
	{
		System.out.println(b);
		System.out.println("Non-Static-Method");
	}

	static
	{
		System.out.println("Static-Block");
	}

	{
		System.out.println("Non-Static-Block");
	}
	
	public static void main(String[] args) 
	{
		P4 oP=new P4();
		System.out.println(oP.a);
		oP.test();
		oP.demo();
	}
}
