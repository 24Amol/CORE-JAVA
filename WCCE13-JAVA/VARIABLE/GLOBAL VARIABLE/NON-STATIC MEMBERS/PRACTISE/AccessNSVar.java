class AccessNSVar 
{
	int a;

	{
		a=10;//Directly
		System.out.println(a);
		this.a=55;//Using this Keywor{
		System.out.println(this.a);
	
	}

	public static void main(String[] args) 
	{
		System.out.println("Main()");
		AccessNSVar obj=new AccessNSVar();
		System.out.println(obj.a);
	}
}
