class CountUppLowVowels 
{
	public static void main(String[] args) 
	{
		String str="I Love Pune.It BeautifAEul Place";

		System.out.println(str);
		int count=0;

		for (int r=0;r<str.length();r++)
		{
			if (str.charAt(r)=='a' || str.charAt(r)=='e' || str.charAt(r)=='o' || str.charAt(r)=='i' || str.charAt(r)=='u')
			{
				System.out.println("The Lowercase Vowels Count Is :"+str.charAt(r));
				count++;
			}
		
		}
		System.out.println("The Lowercase Vowels Are: "+count);
		if (count!=0)
			{
				count=0;
				for (int r=0;r<str.length();r++)
				{
					if (str.charAt(r)=='A' || str.charAt(r)=='E' || str.charAt(r)=='I' || str.charAt(r)=='O' || str.charAt(r)=='U')
					{
						System.out.println("The Uppercase Vowels Are :"+str.charAt(r));
						count++;
					}
				}
			}
		System.out.println("The Upperacse Vowels Count Is : "+count);
	}
}
