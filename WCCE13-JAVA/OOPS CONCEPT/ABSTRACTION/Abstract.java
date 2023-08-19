abstract class Abstract //abstract class
{
	abstract public void demo();//abstract Method

	//Concrete Method
	public void test()//NS Method
	{//Method Implementation
		System.out.println("NS-METHOD-TEST()");
	}
	
	public static void key()//Static Method
	{//Method Implementation
		System.out.println("Static -Method-Key()");
	}


	public static void main(String args[])
	{
		Abstract oA=new Abstract();//We cannot create the Object for the Abstract Class

		System.out.println(oA);
	}

}
