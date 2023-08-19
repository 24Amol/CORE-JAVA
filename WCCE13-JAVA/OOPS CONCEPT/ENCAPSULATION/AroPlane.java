class Passenger
{
	private String name;

	Passenger(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name=name;
	}
}
class AroPlane extends Passenger
{
	
   public static void main(String[] args)
	{
		
		Passenger s1=new Passenger("Rushikesh");
		
	
		//System.out.println(p1.name);//CTE
		//p1.name="Sarish";


		System.out.println(s1.getName());

		s1.setName("Sai");

		System.out.println(s1.getName());

	}
}