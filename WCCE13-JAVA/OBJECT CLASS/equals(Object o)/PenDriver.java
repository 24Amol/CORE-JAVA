class Pen 
{
	String Name;
	String Color;
	double dPrice;

	Pen(String strName,String strColor,double dprice)
	{
		this.Name=strName;
		this.Color=strColor;
		this.dPrice=dprice;
	}

	@Override
	public int hashCode()
	{
		return ((Double)dPrice).hashCode();
	}
	@Override
	public boolean equals(Object o)
	{

		Pen temp=(Pen)o;

		if (this.Name==temp.Name && this.Color==temp.Color && this.dPrice==temp.dPrice)
		{
			return true;
		}
		return false;
	}
}
class PenDriver
{
	public static void main(String[] args) 
	{
		
		Pen oP=new Pen("Champ","Blue",5);
		Pen oP1=new Pen("Pentonic","Black",5);
	
		if (oP.hashCode()==oP1.hashCode())
		{
			System.out.println("The Both Pen Price Are Same");
			if (oP.equals(oP1))
			{
				System.out.println("The Both Pen Are Also Same");
			}
			else
			{
				System.out.println("But Both Pen Are Different");
			}
		}
		
	}
}
