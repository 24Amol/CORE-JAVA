//QNO7=Design A Method To Check Given Character Is Vowel Or Not And Print The Result
class CheckVowelsReturnResult
{	
	public static char checkVowel(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("Given Character Is Vowel");
		}
		else
		{
			System.out.println("Given Character Is Not Vowel");
		}
		return ch;
	}
	public static void main(String[] args) 
	{
		//char res=checkVowel('a');
		//System.out.println(res);
		System.out.println(checkVowel('a'));
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>Given Character Is Vowel					*
-->>a											*
*************************************************/