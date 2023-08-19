class Print10Char 
{
	public static void printChar(char ch)
	{
		System.out.println(ch);
		if (ch=='J')
		{
			return;
		}
		ch++;
		printChar(ch);

	}
	public static void main(String[] args) 
	{
		printChar('A');
	}
}
