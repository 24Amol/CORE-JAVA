class MainMethodCall 
{
	public static void m1() 
	{
		System.out.println("m1");
		m2();
	}
	public static void m2() 
	{
		System.out.println("m2");
		main(new String[0]);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		m1();
	}
}
