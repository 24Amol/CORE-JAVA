class Pattern14 
{
	public static void main(String[] args) 
	{
		for (int r=1;r<=5 ;r++ )
		{
			int num=1;
			char ch='A';
			for (int c=1;c<=5 ;c++ )
			{
				if (r%2!=0)
				{
					System.out.print(" "+ch);
					ch++;
				}
				else
				{
					System.out.print(" "+num);
					num++;
				}
			}
			System.out.println();
		}
	}
}
