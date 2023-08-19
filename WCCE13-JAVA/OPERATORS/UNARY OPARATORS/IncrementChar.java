//QNO1:-Can We Perform Increment Operator For Char Datatype
class IncrementChar
{
	public static void main(String[] args) 
	{
		char ch='a';
		char ch1=ch++;
		char ch2=++ch;
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch2);
	}
}
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>c								*
-->>a								*
-->>c								*
*************************************/