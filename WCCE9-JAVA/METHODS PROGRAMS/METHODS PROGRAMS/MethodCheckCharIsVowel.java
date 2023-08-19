//QNO7=Design A Method To Check Given Character Is Vowel or Not

class MethodCheckCharIsVowel
{

	public static void checkVowel(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("Given Character Is Vowel");
		}
		else if((ch>='A'&& ch<='Z')||(ch>='a'&&ch<='z'))
		{
			System.out.println("Given Character Is Alphabet");
		}
		else if(ch>='0'&&ch<='9')
		{
			System.out.println("Given Chahracter Is Digit");
		}	
		else
		{
			System.out.println(ch+":-Given Character Is A Special Symbol");
		}
	}

	public static void main(String[] args) 
	{
		checkVowel('@');
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>@:-Given Character Is A Special Symbol		*
*************************************************/