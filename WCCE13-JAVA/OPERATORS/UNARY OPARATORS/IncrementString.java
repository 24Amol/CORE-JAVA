//QNO3:-Can We Perform Increment Operator For String Datatype
class IncrementString
{
	public static void main(String[] args) 
	{
		String str="abc";
		String str1=str++;
		String str2=++str1;
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
	}
}
/*********************************************************************************
------------------------->>>>>>>>>>>>>OUTPUT>>>>>>>>>>>>>>>>>>>------------------*
**********************************************************************************
-->>IncrementString.java:7: error: bad operand type String for unary operator '++'
                String str1=str++;
                               ^

-->>IncrementString.java:8: error: bad operand type String for unary operator '++'
                STring str2=++str1;
                            ^
3 errors
*************************************************************************************/