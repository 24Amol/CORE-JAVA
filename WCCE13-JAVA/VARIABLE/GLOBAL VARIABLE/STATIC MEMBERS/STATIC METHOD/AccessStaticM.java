class AccessStaticM 
{
	public static void display()
	{
		System.out.println("Hello World!");
	}
	public static void main(String[] args) 
	{
		AccessStaticM ob=new AccessStaticM();
		display();
		AccessStaticM.display();
		ob.display();
	}
}
