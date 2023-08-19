class Parent 
{
	public void parent()
	{
		System.out.println("Parent Method Is Called");
	}
}
class Child extends Parent
{
	public void child()
	{
		System.out.println("Child Method Is called");
	}
}

class DownCasting
{
	public static void main(String args[])
	{
		Parent oP=new Child();
		System.out.println(oP);

		//Parent oP1=new Parent();
		//oP1.child();

		//Child oC=(Child)oP1;//CTE

		Child oC=(Child)oP;

		oC.child();
	}
}