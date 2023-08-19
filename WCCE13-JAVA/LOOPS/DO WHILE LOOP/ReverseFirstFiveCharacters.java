//QNO=4:-Write A Program to Print First Five Characters In Reverse Order
class ReverseFirstFiveCharacters
{
	public static void main(String[] args) 
	{	
		char ch='e';
		System.out.println("The First Five numbers In Reverse Order:-");
		do
		{
			System.out.println(ch);
			ch--;
		}
		while (ch>='a');
	}
}
/****************************************
----------->>>>>OUTPUT>>>>--------------*
*****************************************
The First Five Charcters Reverse Order:-*
-->>e									*
-->>d									*
-->>c									*
-->>b									*
-->>a									*
*****************************************/