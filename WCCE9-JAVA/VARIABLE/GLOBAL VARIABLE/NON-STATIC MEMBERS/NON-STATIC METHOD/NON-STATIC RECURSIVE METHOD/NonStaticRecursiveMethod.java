//QNO1=Perform Recursive Method Using Non Static Method
class NonStaticRecursiveMethod 
{
	public void show(int n)
	{
		if (n==5)//Base Condition
		{
			return;
		}
		System.out.println(n);
		n++;
	}
	public static void main(String[] args) 
	{
		NonStaticRecursiveMethod oNSRM=new NonStaticRecursiveMethod();
		oNSRM.show(0);
		System.out.println("Hello World!");
	}
}
