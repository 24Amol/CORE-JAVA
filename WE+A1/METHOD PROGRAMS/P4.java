class P4 
{
	public static void m1()
	{
		System.out.println("No Argument M1 Method()");
	}
	public static void m1(int i)
	{
		System.out.println(i);
	}
	public static void m1(float f)
	{
		System.out.println(f);
	}
	public static void m1(int i,float f)//Compiler Confuses
	{
		System.out.println(i+" "+f);
	}
	public static void m1(float f,int i)//Compiler Confuses
	{
		System.out.println(f+" "+i);
	}
	public static void main(String[] args) 
	{
		m1();
		m1(30);
		m1(45.98f);
		m1(47,12.56f);
		m1(91f,45);
		//m1(65,55)//CTE Compiler Confuses
	}
}
