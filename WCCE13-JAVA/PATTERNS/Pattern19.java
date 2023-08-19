class Pattern19 
{
	public static void main(String[] args) 
	{
		for (int r=1;r<=15;r++ )
		{
			for (int c=15;c>=r;c--)
			{
				System.out.print(" "+"*");
			}
		System.out.println();
		}
	}
}
