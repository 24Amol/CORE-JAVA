class StaticDemo
{
	static int a=1;

	static public void display()
	{
		System.out.println(a);
	}
	static public void demo()
	{
		System.out.println(a);
	}
	static public void get()
	{
		System.out.println(a);
	}
	
	 static
	{
		System.out.println(a);
		display();
		demo();
		get();
	}
	static int b=2;
	 
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	 

}
