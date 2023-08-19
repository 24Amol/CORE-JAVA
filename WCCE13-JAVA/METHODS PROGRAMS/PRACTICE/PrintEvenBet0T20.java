class PrintEvenBet0T20 
{
	public static void printEven20(int n)
	{
		while (n<=20)
		{
			if (n%2==0)
			{
				System.out.println(n);
			}
			n++;
		}
	}
	public static void main(String[] args) 
	{
		printEven20(0);
	}
}
