class A 
{	
	int a=10;

	public void display()
	{
		System.out.println("NS METHOD-1");
	}

	{
		System.out.println("NS BLOCK-1");
	}

}
class B extends A
{
	int a=15;

	public void print()
	{
		System.out.println("NS METHOD-2");
		System.out.println(this.a);//==>Directly==>NS VAR -->15
	}

	{
		System.out.println(a);//Own Class==>local==>static==>NonStatic -->15
		int a=20;
		System.out.println(a);//Own Class==>local -->20
		//System.out.println(super.a);//==>Parent class==>NS-Var -->10
		System.out.println("NS BLOCK-2");
	}

	public static void main(String[] args) 
	{
		B obj=new B();
		System.out.println(obj.a);//==>Directly==>NS VAR -->15
		obj.print();
	}
}
