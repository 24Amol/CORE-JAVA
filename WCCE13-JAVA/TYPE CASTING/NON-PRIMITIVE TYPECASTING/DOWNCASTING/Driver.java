class A 
{
	public void print()
	{
		System.out.println("print()-A");
	}
}

class B extends A
{
	public void display()
	{
		System.out.println("print()-B");
	}
}

class Driver
{
	public static void main(String[] args) 
	{

		//Upcasting
		A oA=new B();
		//oA.display();
		//System.out.println(oA);

		//DownCasting
		B oB=(B)oA;
		System.out.println(oB);
		oB.display();

	
		//B oB1=(B)oA1;
		//System.out.println(oB1);//CTE

		



	}
}
