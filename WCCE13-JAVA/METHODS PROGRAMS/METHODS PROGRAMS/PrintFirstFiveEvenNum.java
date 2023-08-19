//QNO19:-Write A Program To Print First Five Even Numbers
class PrintFirstFiveEvenNum
{

	public static void even(int i,int j)
	{
		while(i<=j)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
	public static void main(String[] args) 
	{
		even(0,8);
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>0											*
-->>2											*
-->>4											*
-->>6											*
-->>8											*
*************************************************/