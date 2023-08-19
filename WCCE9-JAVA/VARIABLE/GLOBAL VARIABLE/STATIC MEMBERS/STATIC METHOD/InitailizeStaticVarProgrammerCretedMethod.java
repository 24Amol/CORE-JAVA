//QNO1=Can initailize static variable from a programmer created method

class InitailizeStaticVarProgrammerCretedMethod
{
	static int a;
	static
	{
		method();
	}
	static public void method()
	{
		a=100;
		System.out.println(a);
		InitailizeStaticVarProgrammerCretedMethod.a=200;
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World");
	}
}
/********************************************
--------------->>>>>OUTPUT>>>>--------------*
*********************************************
-->>100										*
-->>Hello World								*
*********************************************/