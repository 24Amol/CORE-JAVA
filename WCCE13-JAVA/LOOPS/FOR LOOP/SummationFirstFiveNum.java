//QNO=9:-Write A Program To Print Summation Of First Five Numbers
class SummationFirstFiveNum 
{
	public static void main(String[] args) 
	{
		int sum=0;
		System.out.println("The First Five Numbers Are:-");
		for (int num=1;num<=5;num++)
		{
			System.out.println(num);
			sum=sum+num;
		}
		System.out.println("The Summation Of First Five Numbers Are:-"+sum);
	}
}
/********************************************
--------------->>>>>OUTPUT>>>>--------------*
*********************************************
The First Five Numbers Are:-				*
-->>1										*
-->>2										*
-->>3										*
-->>4										*
-->>5										*
The Summation Of First Five Numbers Are:-15	*
*********************************************/