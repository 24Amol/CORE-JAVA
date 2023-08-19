//QNO14=Design The Method To Find The Summation Of Numbers which Are divisble by 3 and 9 Between 0 & 100
class SummationDiv3A7Bet0To100ReturnResult
{	
	public static int countSummationNum()
	{
		int sum=0;
		System.out.println("The Division By 3 & 9 Numbers Between 0 To 100 Are:-");
		for (int num=0;num<=100;num++)
		{
			if (num%3==0 && num%9==0)
			{
				System.out.println(num);
				sum=sum+num;
			}				
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println("Summation Is:-"+countSummationNum());
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>Summation Is:-594							*
*************************************************/