class Bank 
{
	public int RateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	public int RateOfInterest()
	{
		return 7;
	}
}

class ICICI extends Bank
{
	public int RateOfInterest()
	{
		return 9;
	}
}

class AXIS extends Bank
{
	public int RateOfInterest()
	{
		return 11;
	}
}
class Test
{
	public static void main(String[] args) 
	{
		AXIS oA=new AXIS();

		Bank oB=oA;
		System.out.println("AXIS Bank rate Of Interest: "+oB.RateOfInterest());

		SBI oS=new SBI();
		Bank oB1=oS;
		System.out.println("SBI Bank rate Of Interest: "+oB1.RateOfInterest());

		ICICI oI=new ICICI();
		Bank oB2=oI;
		System.out.println("ICICI Bank rate Of Interest: "+oB2.RateOfInterest());
	}
}
