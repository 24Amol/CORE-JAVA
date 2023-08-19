abstract class P1 
{
	abstract void demo();//abstract Method

	//Concrete Method
	public void test()//NS Method
	{//Method Implementation
		System.out.println("NS-METHOD-TEST()");
	}
	
	public static void key()//Static Method
	{//Method Implementation
		System.out.println("Static -Method-Key()");
	}

}
class P2 extends P1
{
	void demo()
	{
		System.out.println("Demo()-Method");
	}
	
}

class Demo
{
	public static void main(String[] args) 
	{
		P1 oP1=new P2();//We cannot create the Object for the Abstract Class

		System.out.println(oP1);

		oP1.demo();
		oP1.key();

		P2 oP2=(P2)oP1;
		oP2.demo();
		oP2.test();
		
	}
}