class MainMethod 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method-1");
		main("main-2");
		main();
		main(4);
		main(3,5);
	}
	public static void main(String args) 
	{
		System.out.println("Main Method-2");
	}
	public static void main()
	{
		System.out.println("Main Method-3");
	}
	public static void main(int a)
	{
		System.out.println("Main Method-4");
	}
	public static void main(int a,double b)
	{
		System.out.println("Main Method-5");
	}
}
