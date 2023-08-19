class A extends Object
{
	static int b;
	
	A()
	{
		super();
		System.out.println("A()");
	}

	{
		System.out.println("IIB-A");
	}

	public void demo()
	{
		System.out.println("demo()");
	}
}
class B extends A
{
	
	
	int b=12;

	B()
	{
		super();
		int b=10;
		System.out.println("B()");
		
		System.out.println(this.b);
	}

	
	{
		super.demo();
		System.out.println("IIB-B");
	}

	public void test()
	{
		System.out.println("test()");
	}

	public static void main(String[] args)
	{	
		B b=new B();
	}

}