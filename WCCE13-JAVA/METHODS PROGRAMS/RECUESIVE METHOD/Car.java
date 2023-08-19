class Car
{
	public static void car()
	{
		System.out.println("Car Started");
		drive();
	}
	public static void engine()
	{
		System.out.println("Engine Started");
		car();
	}
    public static void drive()
	{
		System.out.println("Lets Drive");
	}


	public static void main(String[] args) 
	{
		engine();
	}
}
