class IntegerClass 
{
	
	public static void main(String[] args) 
	{
		int n=5;

		Integer obj=Integer.valueOf(n);

		System.out.println(n);//5	
		System.out.println(obj);//5

		n=10;
		System.out.println(n);//10

		obj=100.55;
		System.out.println(obj);//100
	}
}
