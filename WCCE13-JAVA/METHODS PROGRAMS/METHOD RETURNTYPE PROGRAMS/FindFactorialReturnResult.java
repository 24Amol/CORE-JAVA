//QNO9=Design A Method To Find The Factorial Of Given Number & Print The Result
class FindFactorialReturnResult
{	
	public static int findFactorial(int num)
	{
		int fact=1;

		for (int i=1;i<=num;i++)
		{
			fact=i*fact;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		System.out.println(findFactorial(7));
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>5040										*
*************************************************/