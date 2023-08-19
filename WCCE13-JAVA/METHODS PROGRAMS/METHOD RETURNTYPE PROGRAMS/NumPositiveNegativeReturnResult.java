//QNO11=Design A Method To check The Given Number Is Positive Or Negative ANd Print The Result
class NumPositiveNegativeReturnResult
{	
	public static String numPosNeg(int num)
	{		
		String res=num>0?"+Ve":"-Ve";
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println(numPosNeg(-5));
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>-Ve											*
*************************************************/