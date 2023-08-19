class Program2 
{
	public static void main(String[] args) 
	{
		String str="JAVA";

		for (int r=1;r<=str.length();r++)
		{
			for (int c=0;c<str.length();c++ )
			{
				System.out.print(" "+str.charAt(c));
				
			}
		System.out.println();
		}
	}
}
