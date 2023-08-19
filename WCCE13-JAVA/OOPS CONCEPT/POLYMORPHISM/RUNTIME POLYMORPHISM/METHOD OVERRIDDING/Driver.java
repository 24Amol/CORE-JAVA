class P1 
{
	static public void display()
	{
		System.out.println("Class-A()");
	}
}

class P2 extends P1
{
	static public void display()
	{
		System.out.println("Class-B()");
	}
}

class Driver
{
	public static void main(String[] args) 
	{
		B oB=new B();

		A oA=oB;
		oA.display();
	}
}
