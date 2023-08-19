class Static 
{
	static int a;
	static String s;

	public static int m1(int a)
	{
		System.out.println(s);
		System.out.println(a);
		m2(6);
		return a;
	}
	public static void m2(int a)
	{
		System.out.println(Static.a);
		System.out.println(s);
	}

	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(s);
		a=30;
		s="Hello";
		int a=m1(5);
		System.out.println(a);
		System.out.println(Static.a);
	}
}
