class P3 
{
	P3()
	{
	this(123);
	System.out.println("this()");
	}
	P3(int a)
	{
		super();
		System.out.println("super()");
	}
	public static void main(String[] args) 
	{
		P3 obj=new P3();
	}
}
