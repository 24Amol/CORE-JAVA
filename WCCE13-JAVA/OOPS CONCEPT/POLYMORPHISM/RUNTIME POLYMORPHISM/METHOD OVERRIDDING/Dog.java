class Animal 
{
	public void nature()
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal
{

	public void nature()
	{
		System.out.println("Barking");
	}

	public void test()
	{
		//this.nature();
		Dog oD=new Dog();
		oD.nature();

		Animal oA=oD;
		oA.nature();
	}

	{
		//this.nature();
		Dog oD=new Dog();
		oD.nature();

		//Animal oA=oD;
		//oA.nature();

		oD.test();
	}
	public static void main(String[] args) 
	{
		//Dog oD=new Dog();
		//oD.nature();
		//oD.test();

		//Animal oA=oD;
		//oA.nature();



	}
}

