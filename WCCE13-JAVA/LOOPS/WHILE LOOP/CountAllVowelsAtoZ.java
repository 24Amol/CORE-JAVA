//QNO8=Write A Program To Print The Count The Vowels Between A To Z Using The While Loop
class CountAllVowelsAtoZ 
{
	public static void main(String[] args) 
	{
		char ch='a';
		int count=0;

		System.out.println("Vowels:-");
		while (ch<='z')
		{
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{	
				System.out.println(ch);
				count++;
			}
			ch++;
		}
		System.out.println("Number Of Vowels:-"+count);
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
Vowels:-										*
-->>a											*
-->>e											*
-->>i											*
-->>o											*
-->>u											*
Number Of Vowels:-5								*
*************************************************/