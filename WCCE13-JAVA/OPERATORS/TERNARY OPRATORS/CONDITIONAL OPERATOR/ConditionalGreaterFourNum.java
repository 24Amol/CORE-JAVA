//QNO2:-Write A Program To Check Given Number Is Greater Than Of Four Number Using Conditional Operator
class ConditionalGreaterFourNum 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int c=5;
		int d=4;
		System.out.println(a>b && a>c && a>d?a:(b>a && b>c && b>d)? b:(c>a && c>b && c>d)?c:d);
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>5											*
*************************************************/