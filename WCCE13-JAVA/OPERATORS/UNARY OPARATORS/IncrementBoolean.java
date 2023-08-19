//QNO4:-Can We Perform Increment Operator For Boolean Datatype
class IncrementBoolean
{
	public static void main(String[] args) 
	{
		boolean str=true;
		boolean str1=str++;
		System.out.println(str);
		System.out.println(str1);
	}
}
/*********************************************************************************
------------------------->>>>>>>>>>>>>OUTPUT>>>>>>>>>>>>>>>>>>>------------------*
**********************************************************************************
-->>IncrementBoolean.java:7: error: bad operand type boolean for unary operator '++'
                boolean str1=str++;
                                ^
1 error
*************************************************************************************/