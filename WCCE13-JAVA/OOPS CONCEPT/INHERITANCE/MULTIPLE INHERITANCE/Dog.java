interface Animal
{
	void eat();
	void sound();
}

interface Mammal
{
	void thinking();
	void lifestyle();
}
class Dog implements Mammal,Animal
{

	public void eat()
	{
		System.out.println("All Dogs Can Eat");
	}

	public void sound()
	{
		System.out.println("Bow-Bow");
	}

	public void thinking()
	{

		System.out.println("Dogs Can Think");
	}
	public void lifestyle()
	{
		System.out.println("Dogs Lives In Group");
	}

	public static void main(String[] args) 
	{
		//Create Object For Child Class
		Dog d=new Dog();
		//d.eat();
		//d.sound();
		//d.thinking();
		//d.lifestyle();

		//Upcasting From Child to Parent Class
		Mammal m=d;
		//m.thinking();
		//m.lifestyle();

		//Animal a=m;//CTE we cannot be converted Animal to Mammal Class
		//For That we need to use the Cast Operator
		Animal a=(Animal) m;
		//Animal a=d;
		a.eat();
		a.sound();
	}
}
