class DivBy3A4Bet100 
{
	public static void main(String[] args) 
	{
		int num=0;
		int count=0;
		
		while (num<=100)
		{
			if (num%3==0 && num%4==0)
			{
				System.out.println(num);
				count++;
			}
			num++;
		}
		System.out.println("The Number Are Divisible By 3 & 4 Between:-"+count);
	}
}
