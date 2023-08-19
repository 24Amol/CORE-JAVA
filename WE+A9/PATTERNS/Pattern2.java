class Pattern2 
{
	public static void main(String[] args) 
	{
		char Ul='A';
		char Ll='a';

		for (int r=1;r<=4 ;r++ )
		{
			for (int c=1;c<=5;c++)
			{
				
				if (r==1||r==2)
				{
					System.out.print(" "Ul++);
				}
				else if (r==3 || r==4)
				{
					System.out.print(Ll++);
				}
			}
		System.out.println("");
		}
	}
}
