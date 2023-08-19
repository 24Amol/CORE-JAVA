class Butterfly 
{
	public static void main(String[] args) 
	{
		int n=5;
		int nos=1;
		int noc=n*2-1;
		for (int r=1;r<=n*2-1;r++)
		{
			for (int c=1;c<=n*2-1;c++)
			{
				if (c<=nos || c>=noc)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			if (r<n)
			{
				nos++;
				noc--;
			}
			else
			{
				nos--;
				noc++;
			}
		}
	}
}
