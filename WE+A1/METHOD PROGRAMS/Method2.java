class Method2 
{
	public static int test(int a,int b)
	{
		while (a!=b)
		{
			if (a>b)
				a=a-b;
			else
				a=b-a;	
		}
		return a;
	}
	public static int test1(char a,char b)
	{
		return a+b;
	}
	public static void main(String[] args) 
	{
		System.out.println(test(4,17));
		System.out.println(test1('f','e'));
	}
}
