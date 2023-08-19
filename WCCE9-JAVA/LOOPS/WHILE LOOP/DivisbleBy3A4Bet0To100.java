//QNO7=Write A Program To The Number Is Divisible By 3 And 4 Between 0 To 100 Using While Loop
class DivisbleBy3A4Bet0To100 
{
	public static void main(String[] args) 
	{
		int num=0;
		
		while (num<=100)
		{
			if(num%3==0 && num%7==0)
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
-->>21											*
-->>42											*
-->>63											*
*************************************************/