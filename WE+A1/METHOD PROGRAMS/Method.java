class Method2
{
	public static int test(int n)
	{
		int x;
		for (x=1;x<=n;x++ )
		{
			if (n%x==0)
			continue;
		}
		return x;
	}
	public static void main(String[] args) 
	{
		System.out.println(test(12));
	}
}
