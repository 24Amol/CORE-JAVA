class Vehicle 
{
	String name;
	String brand;
	String color;

	Vehicle(String n,String b,String c)
	{
	this.name=n;
	this.brand=b;
	this.color=c;
	}
	@Override
	public String toString()
	{
		return "Name:-"+name+" Brand:-"+brand+" Color:-"+color;
	}

	public static void main(String[] args) 
	{
		Vehicle oV=new Vehicle("Thar","Mahindra","Black");
		Vehicle oV1=new Vehicle("Harrier","TATA","White");

		System.out.println(oV);
		System.out.println(oV1);
	}
}
