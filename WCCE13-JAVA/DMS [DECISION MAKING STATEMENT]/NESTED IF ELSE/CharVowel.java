class CharVowel 
{
	public static void main(String[] args) 
	{
		char ch='a';

		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			if (ch>='A' && ch<='Z')
			{
				System.out.println(ch +" : The Given Character Is Uppercase");
			}
			else
			{
				System.out.println(ch + " : The Given Character Is Lowercase");
			}
		}
		else
		{
			System.out.println(ch + " : The Character Is Special Symbol");
		}
	}
}
