//QNO1=Can We declare a local variable inside a static block

class DeclareLocalVarInsideStaticBlock
{
	static
	{//Static Block
		byte a=1;
		short b=2;
		int c=11;
		long d=123;
		float e=22;
		char f='A';
		double g=23.44;
		String h="Amol";

		System.out.println(a);		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);		
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/********************************************
--------------->>>>>OUTPUT>>>>--------------*
*********************************************
-->>100										*
-->>200										*
-->>Hello World!							*
*********************************************/