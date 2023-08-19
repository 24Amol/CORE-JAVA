class Bike
{
	void run()
	{
		System.out.println("Running");
	}
}

class Splendors extends Bike
{
	void run()
	{
		System.out.println("Running Safely With 60km");
	}

	public static void main(String args[])
	{
		Bike b=new Splendors();//Upcasting
		b.run();
	}
}
