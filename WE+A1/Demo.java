class Demo
{
	static int a=10;
	static int b=15;

	int c=30;
	int d=50;

	//Demo oD5=new Demo();
	static
	{
		System.out.println("Static Block-1");
	}
	static
	{
		System.out.println("Static Block-2");
	}
	static
	{

		
		System.out.println("Static Block-3");
	}
	Demo()
	{
		//Demo oD5=new Demo();
		//System.out.println(oD5.a);
	}
	static
	{
		Demo oD1=new Demo();
		System.out.println(oD1.c);
		System.out.println("Static Block-4");
	}
	
	public void display()
	{
		System.out.println(this.b);
		System.out.println(b);

	}
	public static void main(String[] args) 
	{
		Demo oD=new Demo();
		System.out.println(oD.a);
		System.out.println(oD.d);

	}
}
