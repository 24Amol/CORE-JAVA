class Inheritance 
{
	static int a=20;

	public static void test()
	{
		System.out.println("test()");
	}

	public static void main(String... show)
	{
		System.out.println(a);
		test();
	}
}

class Inherited extends Inheritance
{
	static int a=10;

	public static void demo()
	{
		System.out.println("Demo");
	}

	public static void main(String[] args)
	{
		System.out.println(a);
		System.out.println(Inheritance.a);
		demo();
		test();
	}
}
