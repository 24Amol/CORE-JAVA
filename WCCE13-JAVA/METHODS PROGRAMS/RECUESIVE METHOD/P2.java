class P2 
{
	public static void test(int n)
	{
		System.out.println(n);
		if (n==5)
		{
			return;
		}
		n++;
		test(n);
	}
	public static void main(String[] args) 
	{
			test(0);
	}
}
