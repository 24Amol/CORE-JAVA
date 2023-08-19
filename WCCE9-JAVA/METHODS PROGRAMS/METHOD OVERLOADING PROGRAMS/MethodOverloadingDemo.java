//QNO1=Program For Method Overloading

//This Is Mehtod Overloading 
//Class Consist Of More Than One Method With Same Method Name 
//with Different Argument Is Called Method Overloading

class MethodOverloadingDemo
{
	public static void main(String[] args) 
	{
		test();
		test(11);
	}

	//No Argument Method Is Empty Method We Can't Pass Any Parameter
	public static void test()//No Argument Method
	{
		System.out.println("test()-1");
	}

	//Parameterized Method Consist Of Formal Argument
	public static void test(int a)//Parameterized Method
	{
		System.out.println("test(int-2)");
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>test()-1									*
-->>test(int-2)									*
*************************************************/