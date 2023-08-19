//QNO=6:-Write A Program to Print All The Numbers Which Are Divisible By 3 & 7 Between 0 t0 100
class DivisibleBy3A7Bet0to100 
{
	public static void main(String[] args) 
	{	
		int num=0;
		
		System.out.println("Numbers Are Divsible By 3 & 7 Are:-");

		do
		{
			if (num%3==0 && num%7==0)
			{
				System.out.println(num);
			}
			num++;
		}
		while (num<=100);
	}
}

/****************************************
----------->>>>>OUTPUT>>>>--------------*
*****************************************
-->>Numbers Are Divsible By 3 & 7 Are:-	*
-->>0									*
-->>21									*
-->>42									*
-->>63									*
-->>84									*
*****************************************/