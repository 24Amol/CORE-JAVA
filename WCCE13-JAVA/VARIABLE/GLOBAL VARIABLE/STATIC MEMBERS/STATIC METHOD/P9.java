class P9 
{
	int a;

	{
		
		System.out.println("Non-Static Block");
	}
	public void display()
	{	
		P9 oP=new P9();
		System.out.println(oP.a);
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
