class CountUppercaseVowels 
{
	public static void main(String[] args) 
	{
		char[] ch={'A','B','c','E','e','I','O','U'};
		int Count=0;

		for (int i=0;i<ch.length;i++)
		{
			if (ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				Count++;
			}
		}
		System.out.println("The Uppercase Vowels Are:-"+Count);
	}
}
