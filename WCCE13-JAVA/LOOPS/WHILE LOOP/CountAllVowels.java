class CountAllVowels 
{
	public static void main(String[] args) 
	{
		char ch='a';

		int count=0;

		while (ch<='z')
		{
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch);
				count++;
			}
			ch++;
		}

		System.out.println("The Count Of All Vowels Between a to z Is:-"+count);
	}
}
