class Pattern7 
{
	public static void main(String[] args) 
	{
		int num=1;

		for (int r=1;r<=5;r++)
		{
			for (int c=1;c<=5;c++)
			{
				System.out.print(" "+num);
				num++;
				if (num==10)
				{
					num=1;
				}
			}
		System.out.println();
		}
	}
}
