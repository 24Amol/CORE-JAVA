//QNO3:-Write A Program To Find Factorial Of Given Number

class FindFactorial 
{
	public static void main(String[] args) 
	{
		int num=5;
		int fact=1;

		for (int i=1;i<=num;i++)
		{
			fact=i*fact;
		}
		System.out.println("Factorial Of:"+num+":-"+ fact);
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>Factorial Of:5:-120							*
*************************************************/