//QNO=8:-Write A Program To Count All The Numbers Which Are Divisible By 5 & 7 Between 0 to 200

class CountDivisibleBy5A7Bet0to200
{
	public static void main(String[] args) 
	{
		int num=0;
		int count=0;

		System.out.println("*************Numbers Are:-***********");

		do
		{
			if (num%5==0 && num%7==0)
			{
				System.out.println(num);
				count++;
			}
			num++;
		}
		while (num<=200);
		System.out.println("*********************************************");
		System.out.println("Total Numbers Are Divisible By 5 & 7 Are:-" + count);
		System.out.println("*********************************************");
	}
}

/********************************************
------------->>>>>OUTPUT>>>>----------------*
*********************************************
-->>***************Numbers Are:-*************
-->>0										*
-->>35										*
-->>70										*
-->>105										*
-->>140										*
-->>175										*
*********************************************
Total Numbers Are Divisible By 5 & 7 Are:-6	*
*********************************************	
*********************************************/