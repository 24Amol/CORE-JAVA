class P1 
{

	String strName;
	String strAuName;
	double dPrice;

	P1()
	{

		System.out.println("Deafult Constructor");
	}

	P1(String name,String autName,double dprice)
	{
		this.strName=name;
		this.strAuName=autName;
		this.dPrice=dprice;

		System.out.println(strName+" " +strAuName);
	}

	public static void main(String[] args) 
	{

		P1 Obj=new P1();
		P1 obj1=new P1("Agnipank","APJ",355.55);
		System.out.println("Hello World!");
	}
}
