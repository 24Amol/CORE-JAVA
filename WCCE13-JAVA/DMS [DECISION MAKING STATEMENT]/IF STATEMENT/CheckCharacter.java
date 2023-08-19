class CheckCharacter
{
	public static void main(String[] args) 
	{
		char ch='A';
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("GIven Character IS Vowels");
		}
		else if (ch>='A' && ch<='z')
		{
			System.out.println("The Given Character is Uppercase");
		}
		else if (ch>='a' && ch<='z')
		{
			System.out.println("The Given Character is Lowercase");
		}
		else if (ch>='0' && ch<='9')
		{
			System.out.println("You Entered Digit");
		}
		else
		{
			System.out.println("It Is Special Character");
		}

	}
}
