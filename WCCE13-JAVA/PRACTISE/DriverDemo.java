class A 
{
	public void A()
	{
		System.out.println("A()");
	}
}

class B
{
	public void B()
	{
		System.out.println("B()");
	}
}
class c
{
	public void C()
	{
		System.out.println("C()");
	}
}

class D
{
	public void D()
	{
		System.out.println("D()");
	}
}

class DriverDemo
{
	public static void main(String args[])
	{
		D oD=new D();
		
		C oC=oD;
		oC.D();
	}
}

