//QNO11:-
class ProductofFirstFiveNum 
{
	public static void main(String[] args) 
	{
		int mul=1;
		System.out.println("The First Five Numbers Are:-");
		for (int num=1;num<=5;num++)
		{
			System.out.println(num);
			mul=mul*num;
		}
		System.out.println("The Product Of First Five Numbers Are:-"+mul);
	}
}
/********************************************
--------------->>>>>OUTPUT>>>>--------------*
*********************************************
-->>1										*
-->>2										*
-->>3										*
-->>4										*
-->>5										*
The Product Of First Five Numbers Are:-120	*
*********************************************/