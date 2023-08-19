class CheckChar 
{

	public static void checkCharacter(char ch)
	{
		if (ch>'A' && ch<'Z')
		{
			System.out.println("Uppercase");
		}
		else
		{
			System.out.println("Lowercase");
		}
	}
	public static void main(String[] args) 
	{
		checkCharacter('A');
	}
}
