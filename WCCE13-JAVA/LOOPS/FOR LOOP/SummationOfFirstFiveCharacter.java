//QNO12:-Write A Program To Print he Summation OF First Five Characters Using For Loop

class SummationOfFirstFiveCharacter 
{
	public static void main(String[] args) 
	{
		int sum=0;

		for (char ch='a';ch<='e';ch++)
		{
			System.out.println(ch);
			sum+=ch;
		}
		System.out.println("The Summation Of First five Characters are:-"+sum);
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>a											*
-->>b											*
-->>c											*
-->>d											*
-->>e											*
The Summation Of First five Characters are:-495 *
*************************************************/