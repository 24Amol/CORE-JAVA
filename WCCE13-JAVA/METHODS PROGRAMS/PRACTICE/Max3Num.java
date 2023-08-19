class Max3Num 
{
	public static void max3num(int a,int b,int c)
	{
		System.out.println(a>b && a>c?a:b>c?b:c);
	}
	public static void main(String[] args) 
	{
		max3num(12,55,5);
	}
}
