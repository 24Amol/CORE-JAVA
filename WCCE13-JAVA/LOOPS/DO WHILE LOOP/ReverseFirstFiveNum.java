//QNO=3:-Write A Program to Print First Five Numbers In Reverse Order
class ReverseFirstFiveNum
{
	public static void main(String[] args) 
	{
		int num=5;
		System.out.println("The First Five Numbers Reverse Order:-");
		do
		{
			System.out.println(num);
			num--;
		}
		while (num>=1);
	}
}
/****************************************
----------->>>>>OUTPUT>>>>--------------*
*****************************************
The First Five Numbers Reverse Order:-	*
-->>5									*
-->>4									*
-->>3									*
-->>2									*
-->>1									*
*****************************************/