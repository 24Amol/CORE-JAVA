class Demo 
{
	static int a=100;
	static int b=200;

	static public void display()
	{
		System.out.println(a);
	}
	static
	{
		display();
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
