class OddRev 
{
	public static void oddRevnum(int num)
	{

		while (num>=0)
		{
			if (num%2==1)
			{
				System.out.println(num);
			}
			num--;
		}
	}	
	public static void main(String[] args) 
	{
			oddRevnum(20);
	}
}
