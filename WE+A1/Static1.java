class  Static1
{
	static int a;
	static int b=10;

	static
	{
		System.out.println(a++ * --b);
	}
	static
	{
		System.out.println(++a % 2);
	}
	static
	{
		System.out.println(a/b);
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		System.out.println(++a - --b + b++ - a--);
		System.out.println("End");
	}
}
