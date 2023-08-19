//QNO2=Write A Program To Check given Character Is Vowel Or Not
class ToCheckVowels
{
	public static void main(String[] args) 
	{
		char ch='a';
		switch (ch)/*{Expression/literals}*//*{Switchvalue=a}*/
		{//It check Switch Value Matches With Case Value SV==CV

		case 'a' :	{//CaseValue=a
					System.out.println(ch+":- Given Charcter Is vowel");
					break;
					}
	
		case 'e' :	{
					System.out.println(ch+":- Given character Is vowel"); 
					break;
					}

		case 'i' :	{
					System.out.println(ch+":- Given Character Is Vowel");
					break;
					}

		case 'o' :	{
					System.out.println(ch+":- Given Character Is Vowel");
					break;
					}		

		case 'u' : {
					System.out.println(ch+":- Given Character Is Vowel");
					break;
					}
		
		default:{
				System.out.println(ch+":- Given Character Is Alphabet");
				}
		}
	}
}

/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->> a : - Given Character Is Vowel	*
*************************************/