class Summation 
{
	public void getData(int a)
	{
		int sum=0;
		for (int i=0;i<=a ;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) 
	{
		Summation ob=new Summation();
		ob.getData(10);
	}
}
