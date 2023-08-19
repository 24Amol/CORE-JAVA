import java.util.Scanner;
import java.util.Random;

interface ATM
{
	void withdraw();
	void checkBalance();
}
interface Bank
{
	void loan();
	void account();
	void deposite();
	void withdraw();
}
/**************************************************************************************
============================= SBI BANK ================================================
***************************************************************************************/
class SBI implements ATM,Bank
{
	
	String Name;
	int Age;
	String Add;
	long PhonNo;
	String AccType;
	double LoanAmm;

	double Ammount;
	double Deposite;
	double withdraw;

	double AccBalance;
	int AtmPin;

	int AccNo;
	
	Scanner scanner=new Scanner(System.in);

	
	public void details()
	{
		System.out.println("========================================================================================");
		System.out.println("**********************************  WELCOME TO SBI BANK ********************************");
		System.out.println("========================================================================================");
		System.out.println("====================================================");
		System.out.println(" Please Fill Details ");
		System.out.println("====================================================");
		System.out.println("Enter Your Name");
		Name=scanner.next();
		System.out.println("Enter Your Age ");
		Age=scanner.nextInt();
		System.out.println("Enter Your Phone Number");
		PhonNo=scanner.nextLong();
		System.out.println("Enter Your Account Type");
		AccType=scanner.next();
		System.out.println("Set Your ATM Pin");
		AtmPin=scanner.nextInt();

		this.account();
	}

	public void account()
	{
		System.out.println("====================================================");
		System.out.println("*************  Account Details  **************");
		System.out.println("====================================================");
		System.out.println("Account Holder Name :"+Name);
		System.out.println("Account Holder Age :"+Age);
		System.out.println("Account Holder Phone Number :"+PhonNo);
		System.out.println("Account Holder Address :"+Add);
		System.out.println("Account Type :"+AccType);

		Random rand=new Random();
		AccNo=rand.nextInt(1000);

		System.out.println("Your Account No Is :"+AccNo);

		System.out.println("====================================================");
		System.out.println(" Your ==>==> "+AccType+" ==>==> Is Created ");
		System.out.println("====================================================");
		System.out.println();


	}
	public void withdraw()
	{
		System.out.println("Please Enter Your Account Number");
		int accNo=scanner.nextInt();

		if (AccNo==accNo)
		{
			System.out.println("Enter Ammount To Withdraw :");
			double money=scanner.nextDouble();

			if (this.AccBalance>=money)
			{
				System.out.println("Enter Your Atm Pin");
				int atmPin=scanner.nextInt();

				if (this.AtmPin==atmPin)
				{
					AccBalance-=money;

					System.out.println("Your Amount Is Succesfully Withdraw ");
					System.out.println("Your Account Balance Is : "+AccBalance);
				}
				else
				{
					System.out.println("You have Enetered Wrong Pin....!!!");
				}
			}
			else
			{
				System.out.println("You have insufficient Account Balance ");
			}
		}
		else
		{
			System.out.println("This Account Is Not Exist");
			System.out.println("Do You Want To Create Account : ? \n1.Yes \n2.No");
			
			int choice=scanner.nextInt();

			switch(choice)
			{
				case 1:
				
					System.out.println("In Which Bank You Want To Create The Account ");
					System.out.println("\n1Axis Bank \n2.SBI Bank \n3.ICICI Bank \n4.UNION Bank \n5.Bank of Baroda");
					Scanner scanner=new Scanner(System.in);
					int choice1=scanner.nextInt();
					switch(choice1)
					{
						case 1:
							SBI sbi=new SBI();
							sbi.details();
							break;
					}
					break;
				case 2:
					System.out.println("Thanks For Using Our Services");
			}
		}
	}
	
	
	public void deposite()
	{

	}

	public void checkBalance()
	{

	}
	public void loan()
	{

	}
			
}
class SBIDriver
{
	public static void main(String args[])
	{
		
	}
	
}
class ATMDriver implements ATM
{
	String Name;
	int Age;
	String Add;
	long PhonNo;
	String AccType;
	double LoanAmm;

	double Ammount;
	double Deposite;
	double withdraw;

	double AccBalance;
	int AtmPin;

	int AccNo;

	Scanner scanner=new Scanner(System.in);
	
	public void withdraw()
	{
		System.out.println("Please Enter Your Account Number");
		int accNo=scanner.nextInt();

		if (AccNo==accNo)
		{
			System.out.println("Enter Ammount To Withdraw :");
			double money=scanner.nextDouble();

			if (this.AccBalance>=money)
			{
				System.out.println("Enter Your Atm Pin");
				int atmPin=scanner.nextInt();

				if (this.AtmPin==atmPin)
				{
					AccBalance-=money;

					System.out.println("Your Amount Is Succesfully Withdraw ");
					System.out.println("Your Account Balance Is : "+AccBalance);
				}
				else
				{
					System.out.println("You have Enetered Wrong Pin....!!!");
				}
			}
			else
			{
				System.out.println("You have insufficient Account Balance ");
			}
		}
		else
		{
			System.out.println("This Account Is Not Exist");
			System.out.println("Do You Want To Create Account : ? \n1.Yes \n2.No");
			
			int choice=scanner.nextInt();

			switch(choice)
			{
				case 1:
				
					System.out.println("In Which Bank You Want To Create The Account ");
					System.out.println("\n1Axis Bank \n2.SBI Bank \n3.ICICI Bank \n4.UNION Bank \n5.Bank of Baroda");
					Scanner scanner=new Scanner(System.in);
					int choice1=scanner.nextInt();
					switch(choice1)
					{
						case 1:
							SBI sbi=new SBI();
							sbi.details();
							break;
					}
					break;
				case 2:
					System.out.println("Thanks For Using Our Services");
			}
		}
	}
	public void checkBalance()
	{

	}

}

class MainDriver
{
	public static void main(String args[])
	{
		ATMDriver atmDriver=new ATMDriver();

		ATM atm=atmDriver;
	
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Welcom To Our ATM Service");
		System.out.println("Enter Your Choice \n1.Withdraw \n2.Check Balance");
		int choice=scanner.nextInt();
		switch(choice)
		{
			case 1:
				atm.withdraw();
				break;

			case 2:
				atm.checkBalance();
				break;
		}

	}
}