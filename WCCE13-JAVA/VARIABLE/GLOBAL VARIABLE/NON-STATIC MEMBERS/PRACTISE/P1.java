class P1 
{
	int a=10;
	
	public void display()
	{
		P1 obj=new P1();
		System.out.println(obj.a);
		System.out.println("Non-Static Method");
	}

	{
		System.out.println("Non-Static Block");
	}
	public static void main(String[] args) 
	{
		
		P1 o1=new P1();
		o1.display();
		
	}
}
