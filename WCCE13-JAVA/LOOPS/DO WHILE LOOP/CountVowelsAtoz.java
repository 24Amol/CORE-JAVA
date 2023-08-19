//QNO=7:-Write A Program to Count All The Vowels Between A to Z 

class CountVowelsAtoz
{
	public static void main(String[] args) 
	{
		char ch='a';
		int count=0;

		System.out.println("Vowels Are:-");

		do
		{
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch);
				count++;
			}
			ch++;
		}
		while (ch<='z');

		System.out.println("Count Of Vowels:-" + count);
	}
}

/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
Vowels Are:-						*
-->>a								*
-->>e								*
-->>i								*
-->>o								*
-->>u								*
Count Of Vowels:-5					*
*************************************/