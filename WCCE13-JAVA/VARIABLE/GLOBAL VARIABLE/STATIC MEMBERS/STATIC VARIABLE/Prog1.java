//Accessing Static Varible From One Class To Another
class Prog1
{
	static int a;

	static{
		a=10;
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println("From Main Method Of Prog1");
		test();
	}

	public static void test()
	{
		System.out.println(Ex.b);
	}
}
