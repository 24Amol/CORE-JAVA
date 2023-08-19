class FindMaxThree 
{
	public static int findMax(int a,int b,int c)
	{
		if (a>b && b>c)
		{
			return a;
		}
		else if (b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	public static void main(String[] args) 
	{
		int res=findMax(47,64,47);
		System.out.println(res);
	}
}
