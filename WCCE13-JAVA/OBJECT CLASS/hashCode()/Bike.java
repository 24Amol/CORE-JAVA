class Bike 
{
	String brand;
	int cc;

	Bike(String b,int c)
	{
		this.brand=b;
		this.cc=c;
	}
	@Override
	public int hashCode()
	{
		return ((Integer)cc).hashCode();
	}
	
	public static void main(String[] args) 
	{
		Bike oB=new Bike("Yamaha",1000);
		Bike oB1=new Bike("Yamaha",100);

		System.out.println(oB.hashCode());
		System.out.println(oB1.hashCode());
	}
}
