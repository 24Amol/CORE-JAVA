//QNO5:How Many Ways We Can Access The Static Variable

//Answer:-WE Can Access The Static Varible Into Two Ways:-
//1:-Directly By Its Name
//2:-Class Name As A Refernce
class StaticVariablAccess 
{
	static int n=10;
	public static void main(String[] args) 
	{
		StaticVariablAccess ob=new StaticVariablAccess();
		System.out.println(n);//Directly By Variable Name
		System.out.println(StaticVariablAccess.n);//Class Name As A Reference
		System.out.println(ob.n);

	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>10											*
-->>10											*
*************************************************/