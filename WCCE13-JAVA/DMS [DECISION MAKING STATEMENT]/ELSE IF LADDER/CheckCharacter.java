class CheckCharacter 
{
	public static void main(String[] args) 
	{
		char ch='#';

		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" : It is an Vowel");
		}
		else if (ch>='A' && ch<='Z')
		{
			System.out.println(ch + ": It Is An Uppercase Letter");
		}
		else if (ch>='a' && ch<='z')
		{
			System.out.println(ch + " : It Is an Lowercase Letter");
		}
		else if (ch>='0' && ch<='9')
		{
			System.out.println(ch + " : It Is an Didit");
		}
		else
		{
			System.out.println(ch + ": It Is An Special Character");
		}
	}
}
