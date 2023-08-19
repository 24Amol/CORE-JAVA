abstract class Bike
{
	static int cc;
	static public void test()
	{
		System.out.println("Static Method test() Bike Class");
	}
	static
	{
		System.out.println("STATIC BLOCK");
	}
	
	int b;
	public void demo()
	{
		System.out.println("Ns Demo() Method Bike Class");
	}
	{
		System.out.println("NS -BLOCK Bike Class");
	}

	Bike()
	{
		System.out.println("No Argument Constructor Bike Class");
	}

	
	abstract public void run();
}

class Splendor extends Bike
{
	String color;
	int cc;
	public void run()
	{
		System.out.println("Abstarct Method Of Class Bike");
	}

	Splendor()
	{
		super();
		System.out.println("No Argument Constructor Of Splendor");
	}
	Splendor(String c,int cc)
	{
		this.color=c;
		this.cc=cc;
	}

	public static void main(String[] args) 
	{
		Splendor oS=new Splendor("BLack",100);
		Bike oB=oS;

		oB.run();
		oB.demo();
		System.out.println(oB.cc);
		System.out.println(oB.b);
	}

}

