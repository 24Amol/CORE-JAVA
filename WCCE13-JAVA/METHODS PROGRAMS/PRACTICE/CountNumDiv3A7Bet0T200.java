class CountNumDiv3A7Bet0T200
{
	public static void countNum(int num)
	{
		int Count=0;
		while (num<=200)
		{
			if (num%3==0 && num%7==0)
			{
				System.out.println("The Number Are Divisible :-"+num);
				Count++;
			}
			num++;
		}
		System.out.println("Total Count Is:"+Count);
	}
	public static void main(String[] args) 
	{
		countNum(0);
	}
}
