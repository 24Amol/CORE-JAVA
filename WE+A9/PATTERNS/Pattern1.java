class Pattern1 
{
	public static void main(String[] args) 
	{
		for (int r=1;r<=3 ;r++)
		{
			for (int c=1;c<=5 ;c++ )
			{
				if (r==1)
				{
					System.out.print(" @");
				}
				else if (r==2)
				{
					System.out.print(" $");
				}
				else 
				{
					System.out.print(" #");
				}
			}
		System.out.println("");
		}
	}
}
