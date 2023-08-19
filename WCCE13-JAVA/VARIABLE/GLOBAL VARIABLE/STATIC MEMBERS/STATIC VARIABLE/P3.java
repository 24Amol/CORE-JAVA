class P3 
{
	static public void demo()
	{
		System.out.println("Demo()");
	}
	static
	{
		demo();
		P3.demo();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
