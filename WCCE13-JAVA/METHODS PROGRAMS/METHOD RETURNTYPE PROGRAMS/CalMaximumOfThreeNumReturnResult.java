//QNO4=Design A Method To Print Maximum Number Of Given Number And return Value Back

class CalMaximumOfThreeNumReturnResult
{
	public static int calMaxThreeNum(int a, int b,int c)
	{
		int res=0;
		if(a>b && a>c)
		{
			System.out.println("A Is Greter");
			res=a;
		}
		else if (b>a && b>c)
		{
			System.out.println("B Is Greater");
			res=b;
		}
		else
		{
			System.out.println("C Is Greater");
			res=c;
			
		}
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println(calMaxThreeNum(3,26,1));
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>B Is Greater								*
-->>26											*
*************************************************/