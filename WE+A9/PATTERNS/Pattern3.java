class Pattern3 
{
	public static void main(String[] args) 
	{
		char ch='A';

		for (int r=1;r<=4 ;r++)
		{
			if (ch=='K')
				{
					ch='a';
				}
			for (int c=1;c<=5 ;c++ )
			{
				System.out.print(ch + " ");
				ch++;
			}
		System.out.println("");
		}
	}
}
