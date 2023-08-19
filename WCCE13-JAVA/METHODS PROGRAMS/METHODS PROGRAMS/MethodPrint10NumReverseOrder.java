//QNO12:-Design A Method To Print First 10 Numbers In Reverse Order
class MethodPrint10NumReverseOrder 
{
	public static void reverseNum(int i,int j)
	{
		while(i>=j)
		{
			System.out.println(i);
			i--;
		}
	}
	public static void main(String[] args) 
	{

		reverseNum(10,1);
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>10											*
-->>9											*
-->>8											*
-->>7											*
-->>6											*
-->>5											*
-->>4											*
-->>3											*
-->>2											*
-->>1											*
*************************************************/