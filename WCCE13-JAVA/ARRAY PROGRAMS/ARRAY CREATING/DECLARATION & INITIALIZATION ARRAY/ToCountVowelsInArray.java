//QNO5=Write A Program To Count The Number Of Vowels In The Array And Print The Array
class ToCountVowelsInArray 
{
	public static void main(String[] args) 
	{
		char ch[]={'a','m','o','l'};

		int count=0;
		int a=0;
		
		for(char index=0;index<ch.length;index++)
		{
			if (ch[index]=='a'||ch[index]=='e'||ch[index]=='i'||ch[index]=='o'||ch[index]=='u')
			{	
				count++;
				System.out.println(ch[index]);
			}

		}
		System.out.println("Number Of Vowels:-"+count);
	}
}
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>a								*
-->>o								*
-->>Number Of Vowels:-2				*
*************************************/