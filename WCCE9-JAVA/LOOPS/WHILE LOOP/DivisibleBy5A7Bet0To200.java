//QNO6=Write A Program To Print The Number Divisible By 5 And 7 Between 0 To 200
class DivisibleBy5A7Bet0To200 
{
	public static void main(String[] args) 
	{
		int num=0;

		while (num<=200)
		{
			if(num%5==0 && num%7==0)
			{
				System.out.println(num);
			}
			num++;
		}
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>0											*
-->>35											*
-->>70											*
-->>105											*
-->>140											*
-->>175											*
*************************************************/