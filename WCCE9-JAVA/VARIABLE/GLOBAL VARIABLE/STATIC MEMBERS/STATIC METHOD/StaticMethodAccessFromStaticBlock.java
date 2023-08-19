//QNO4=Can We Access The Static Method From A Static Block?In How Many Ways?

class StaticMethodAccessFromStaticBlock
{
	static public int add(int a,int b)
	{
		int res=a+b;
		return res;
	}
	static
	{
		int res=add(2,5);//Method Call Statement
		System.out.println(res);
		System.out.println("Addition Is:-"+StaticMethodAddition.add(3,5));//Class Name As A Rreference
	}
	public static void main(String[] args) 
	{
		
	}
}
/********************************************
--------------->>>>>OUTPUT>>>>--------------*
*********************************************
-->>8										*
*********************************************/