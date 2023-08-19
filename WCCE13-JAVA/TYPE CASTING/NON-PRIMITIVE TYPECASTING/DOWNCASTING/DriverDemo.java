class Animal
{
	public void eat()
	{
		System.out.println("Eating");
	}

}
class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Barking");
	}
}
class BabyDog extends Dog
{
	public void weep()
	{
		System.out.println("Weeping");
	}
}
class DriverDemo
{
	public static void main(String args[])
	{
		BabyDog oB=new BabyDog();

		//Upcasting
		Dog oD=oB;
		oD.bark();

		//Downcasting
		BabyDog oB1=(BabyDog)oD;
		oB1.weep();
	}	
}

