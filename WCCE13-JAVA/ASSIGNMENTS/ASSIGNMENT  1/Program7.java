import java.util.Scanner;

interface Bank
{
	void loan();
	void account();
	void checkBal();
	void deposite();
	void withdraw();

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

	String Password;

	static int rate=7;


	Scanner oSC=new Scanner(System.in);

	static
	{
		System.out.println("========================================================================================");
		System.out.println("**********************************  WELCOME TO SBI BANK ********************************");
		System.out.println("========================================================================================");
	}

	public void details()
	{
		System.out.println("====================================================");
		System.out.println(" Please Fill Details ");
		System.out.println("====================================================");
		System.out.print("Enter Your Name ----");
		String name=oSC.nextLine();
		System.out.print("Enter Your Age ----");
		int age=oSC.nextInt();
		System.out.println("Enter Your Phone Number ----");
		String phoNo=oSC.next();
		System.out.println("Enter Your Address ----");
		String add=oSC.next();
		System.out.print("Enter Account Type ----");
		String AccType=oSC.next();
		System.out.print("Enter Account Password ----");
		String Pass=oSC.next();
		System.out.println();

		this.name=name;
		this.age=age;
		this.phoneNo=phoNo;
		this.Add=add;
		this.AccType=AccType;
		this.Password=Pass;
	}

	public void account()
	{
		this.details();

		System.out.println("====================================================");
		System.out.println("*************  Account Details  **************");
		System.out.println("====================================================");
		System.out.println("Account Holder Name :"+name);
		System.out.println("Account Holder Age :"+age);
		System.out.println("Account Holder Phone Number :"+phoneNo);
		System.out.println("Account Holder Address :"+Add);
		System.out.println("Account Type :"+AccType);
		System.out.println("====================================================");
		System.out.println(" Your ==>==> "+AccType+" Account "+"==>==> Is Created ");
		System.out.println("====================================================");
		System.out.println();
	}

	
	public void deposite()
	{
		System.out.println("====================================================");
		System.out.println("Enter Your Deposite Ammount");
		double deposite=oSC.nextDouble();
		this.deposite=deposite;
		System.out.println("Your Deposite Ammount Is :"+deposite);
		Ammount+=deposite;
		System.out.println("Your Account Balance Is: "+Ammount);
		System.out.println("====================================================");
		System.out.println();
	}
	
	
	double SI;
	float time;

	public void loan()
	{
		
		System.out.println("====================================================");
		System.out.print("Enter Your Loan Ammount : ");
		double PA=oSC.nextDouble();
		System.out.println("Your Loan Ammount Is :"+PA);
		System.out.print("Enter Your Duration : ");
		float time=oSC.nextFloat();
		System.out.println("Your Duration "+time);
		System.out.println("====================================================");
		SI=(PA*rate*time)/100;
		System.out.println("====================================================");
		System.out.println("Your Interest Ammount Is :"+SI);
		System.out.println("====================================================");
	}

	public void checkBal()
	{
		System.out.println("Your Account Balance Is :"+Ammount);
	}

}

class SbiAtm extends Sbi
{

	public void withdraw()
	{
		System.out.println("Enter Your Password");
		String Pass=oSC.next();
		if (Password.equals(Pass))
		{
			System.out.println("====================================================");
			System.out.println(" Enter Your withdraw Ammount :");
			double withdraw=oSC.nextDouble();
			System.out.println(" Your withdraw Ammount "+withdraw);
			Ammount=Ammount-withdraw;
			System.out.println("Your Account Balance Is: "+Ammount);
			System.out.println("===================================================");
			System.out.println(" ==> ==> Thanks For Using SBI BANK SERVICE ==> ==> ");
			System.out.println("===================================================");
		}
		else
		{
			System.out.println("You Have Entered The Wrong Password");
		}
		
	}
}


/**************************************************************************************
============================= DRIVER CLASS ============================================
***************************************************************************************/

class Program7 
{
	static Scanner oSC=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		SbiAtm oSA=new SbiAtm();
		//Upcating From Sbi To Interface Bank
		Bank oB=oSA;

		oB.account();
		oB.deposite();
		oB.withdraw();
		oB.loan();

		boolean login=true;

		/*while (login)
		{
			System.out.println("Enter Your Choice \n 1.Withdraw \n2.Check Account Balance \n3.Exit ");
			int choice=oSC.nextInt();

			switch (choice)
				{
					case 1:{	
						oB.withdraw();
						break;
					}

					case 2:{
						oB.checkBal();
						break;
					}

					case 3:{
						login=false;	
					}

				}
		}*/


	
		/*AxisAtm oAA=new AxisAtm();
		/*oAA.account();
		oAA.deposite(10000);
		oAA.withdraw(500);
		oAA.loan(100000,30);*/

		/*Bank oB=oAA;
		oB.account();
		oB.deposite(1000);
		oB.withdraw(500);*/

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
