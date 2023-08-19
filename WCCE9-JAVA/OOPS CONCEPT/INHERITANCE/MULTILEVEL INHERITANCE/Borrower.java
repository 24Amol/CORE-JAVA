class Customer 
{
	String strName;
	String strPhonNo;

	Customer()
	{
		strName="";
		strPhonNo="";
	}
	Customer(String name,String phonNo)
	{
		strName=name;
		strPhonNo=phonNo;
	}
	void display1()
	{
		System.out.println("The Customer Name Is:-"+strName);
		System.out.println("The Customer Phone No Is:-"+strPhonNo);
	}
}

class Depositer extends Customer
{
	String AccNo;
	double dBal;

	Depositer()
	{
		AccNo="";
		dBal=0.0;
	}

	Depositer(String n,String pn,String AccNo,double dBal)
	{
		super(n,pn);
		this.AccNo=AccNo;
		this.dBal=dBal;
	}

	void display2()
	{
		System.out.println("The Account Number Is:-"+AccNo);
		System.out.println("The Balance Is:-"+dBal);
	}

}

class Borrower extends Depositer
{
	int iLoanNo;
	double dLoanAmount;
	
	Borrower(String n,String ph,String AccNo,double dBal,int iLN,double dLA)
	{
		super(n,ph,AccNo,dBal);
		iLoanNo=iLN;
		dLoanAmount=dLA;
	}
	void display3()
	{
		System.out.println("The Loan Number Is:-"+iLoanNo);
		System.out.println("The Loan Amount Is:-"+dLoanAmount);
	}
	public static void main(String args[])
	{
		Borrower oB=new Borrower("Amol","9373428581","737782678425",55000.6,555,11000);
		oB.display1();
		oB.display2();
		oB.display3();
	}
}
