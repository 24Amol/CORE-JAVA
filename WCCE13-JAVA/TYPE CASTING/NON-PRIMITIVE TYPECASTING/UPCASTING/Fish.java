class Animal
{
	String Name;

	public void nature()
	{
		System.out.println("Animal");
	}
}

class Fish extends Animal
{
	String Color;

	public void nature()
	{
		System.out.println("Aquatic Animal");
	}

	public static void main(String args[])
	{
		Fish f=new Fish();
		System.out.println(f);

		f.Name="Whale";
		f.Color="Blue";

		Animal a=f;
		System.out.println(a);

		System.out.println(a.Name);
		System.out.println(f.Color);
	}
}


