//QNO=8:-Write A Program To Count All Numbers which Are Divisible By 5 & 7 Between 0 to 200 Using For Loop


class CountDivisibleBy5A7
{
	public static void main(String[] args) 
	{
		int num;
		int count=0;

		for (num=0;num<=200;num++)
		{
			if (num%5==0 && num%7==0)
			{
				System.out.println(num);
				count++;
			}
		}
		System.out.println("Total Numbers Are Divisible By 5 & 7 Are:-" + count);
	}
}
/********************************************
--------------->>>>>OUTPUT>>>>--------------*
*********************************************
-->>0										*
-->>35										*
-->>70										*
-->>105										*
-->>140										*
-->>175										*
Total Numbers Are Divisible By 5 & 7 Are:-6	*
*********************************************/
