//QNO8=Design A Method To Cont The Even Number Between 0 to 50 And Print The Result
class CountEvenNumBet0To50ReturnResult
{	
	public static int countEvenNum(int a)
	{
		int count=0;
		int num=0;
		for (System.out.println("Even Numbers:-");num<a;System.out.print(""))
		{
			System.out.println(num);
			num+=2;
			count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println("Total Even Numbers Area:-\n"+countEvenNum(50));
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>To9tal Even Numbers Are:-25					*
*************************************************/