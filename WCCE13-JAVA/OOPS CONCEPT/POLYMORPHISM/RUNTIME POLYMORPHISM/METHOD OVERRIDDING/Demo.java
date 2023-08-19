class A 
{
	int a=10;
	static public void display()
	{
		System.out.println("Class-A()");
	}
}

class B extends A
{
	int a=20;
	static public void display()
	{
		System.out.println("Class-B()");
	}
}

class Demo
{
	public static void main(String[] args) 
	{
		B oB=new B();

		A oA=oB;
		System.out.println(oA.a);
	}
}
