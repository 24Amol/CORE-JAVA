//QNO11:-Design A Method To Find Largest Number Of 3 Numbers
class MethodFindLargestNumof3 
{
	public static void findLargestNum(int a,int b,int c)
	{
		if(a>b && a>b)
		{
			System.out.println("A Is Greater:-"+a);
		}
		else if (b>a && b>c)
		{
			System.out.println("B Is Greater:-"+b);
		}
		else
		{
			System.out.println("C Is Greater");
		}
	}
	public static void main(String[] args) 
	{
		findLargestNum(15,11,5);
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>A Is Greater:-15							*
*************************************************/