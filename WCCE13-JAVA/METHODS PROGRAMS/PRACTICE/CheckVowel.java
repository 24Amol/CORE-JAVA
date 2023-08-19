class CheckVowel 
{
	public static void checkVowel(char ch)
	{
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+":Given Character Is Vowel");
		}
		else
		{
			System.out.println(ch+":Given Character Is Not Vowel");
		}
	}

	public static void main(String[] args) 
	{
		checkVowel('a');
	}
}
