class FindFactorial 
{
	public static void findFact(int num)
	{
		int fact=1;
		/*for (int i=1;i<=num;i++)
		{
			fact=i*fact;
		}*/
		int i=1;

		while (i<=num)
		{
			fact=i*fact;
			i++;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) 
	{
		findFact(5);
	}
}
