interface Bank
{
	void loan(double loan,float time);
	void account();
	void deposite(double d);
	void withdraw(double w);
}

/**************************************************************************************
============================= SBI BANK ================================================
***************************************************************************************/
abstract class Sbi implements Bank
{
	String name;
	int age;
	String Add;
	String phoneNo;
	String AccType;
	double loAmm;

	double Ammount;
	double deposite;
	double withdraw;

	static int rate=7;

	static
	{
		System.out.println("========================================================================================");
		System.out.println("**********************************  WELCOME TO SBI BANK ********************************");
		System.out.println("========================================================================================");
	}

	public void details(String strName,int age,String PNo,String Add,String acctype)
	{
		System.out.println("====================================================");
		System.out.println(" Please Fill Details ");
		System.out.println("====================================================");
		System.out.println("Enter Your Name ----");
		System.out.println("Enter Your Age ----");
		System.out.println("Enter Your Phone Number ----");
		System.out.println("Enter Your Address ----");
		System.out.println("Enter Account Type ----");
		this.name=strName;
		this.age=age;
		this.phoneNo=PNo;
		this.Add=Add;
		this.AccType=acctype;
	}

	public void account()
	{
		this.details("Amol",24,"9373428581","Pandharpur","Saving Account");

		System.out.println("====================================================");
		System.out.println("*************  Account Details  **************");
		System.out.println("====================================================");
		System.out.println("Account Holder Name :"+name);
		System.out.println("Account Holder Age :"+age);
		System.out.println("Account Holder Phone Number :"+phoneNo);
		System.out.println("Account Holder Address :"+Add);
		System.out.println("Account Type :"+AccType);
		System.out.println("====================================================");
		System.out.println(" Your ==>==> "+AccType+" ==>==> Is Created ");
		System.out.println("====================================================");
		System.out.println();
	}


	public void deposite(double d)
	{
		System.out.println("====================================================");
		this.deposite=d;
		System.out.println("Your Deposite Ammount Is: "+deposite);
		Ammount+=d;
		System.out.println("Your Account Balance Is: "+Ammount);
		System.out.println("====================================================");
		System.out.println();
	}
	

	double Si;

	public void loan(double PA,float time)
	{
		System.out.println("====================================================");
		System.out.println("Your Loan Ammount Is :"+PA);
		System.out.println("====================================================");
		Si=(PA*rate*time)/100;
		System.out.println("====================================================");
		System.out.println("Your Interest Ammount Is :"+Si);
		System.out.println("====================================================");
	}

}

class SbiAtm extends Sbi
{

	public void withdraw(double withdraw)
	{
		System.out.println("====================================================");
		Ammount=Ammount-withdraw;
		System.out.println("Your withdraw Ammount Is: "+withdraw);
		System.out.println("Your Account Balance Is: "+Ammount);
		System.out.println("===================================================");
		System.out.println(" ==> ==> Thanks For Using SBI BANK SERVICE ==> ==> ");
		System.out.println("===================================================");
	}
}

class Program2 
{
	public static void main(String[] args) 
	{
		//SbiAtm oSA=new SbiAtm();
		//Upcating From Dev3 To Interface Bank
		//Bank oB=oSA;
	
		AxisAtm oAA=new AxisAtm();
		/*oAA.account();
		oAA.deposite(10000);
		oAA.withdraw(500);
		oAA.loan(100000,30);*/

		Bank oB=oAA;
		oB.account();
		oB.deposite(1000);
		oB.withdraw(500);

		//Steps to Perform 100% Abstarction
		//1.Interface
		//2.abstarction
		//3.Inheritance
		//4.Method Overriding
		//5.Upcating


		/* Using Interface Bank We can directly call child class Method 
		and that method Overridden on interface Bank through that we can
		hide the actual implementation Of child Class.*/

		/*Using these we can Hide Most Important Deatils and Show Less Imortant
			Deatails*/

	}
}
