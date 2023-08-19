import java.util.Scanner;
import java.util.Random;

class SBIDriver extends SBI
{
	Scanner scanner=new Scanner(System.in);
	public void details()
	{
		System.out.println("========================================================================================");
		System.out.println("**********************************  WELCOME TO SBI BANK ********************************");
		System.out.println("========================================================================================");
		System.out.println("====================================================");
		System.out.println(" Please Fill Details ");
		System.out.println("====================================================");
		System.out.print("Enter Your Name\n==>");
		Name=scanner.next();
		System.out.print("Enter Your Age\n==>");
		Age=scanner.nextInt();
		System.out.print("Enter Your Phone Number\n==>");
		PhonNo=scanner.nextLong();
		System.out.print("Enter Your Account Type\n==>");
		System.out.println("\n1.Saving Account\n2.Current Account");
		int accType=scanner.nextInt();
		switch(accType)
		{
			case 1:
				AccType="Saving Account";
				System.out.println("You Choose : " +AccType);
				break;
			case 2:
				AccType="Currrent Account";
				System.out.println("You Choose : " +AccType);
				break;
			default:
				System.out.println("You Have Entered Wrong Choice");
		}
	
		System.out.print("Set Your ATM Pin\n==>");
		AtmPin=scanner.nextInt();

		System.out.print("$$$$ For ATM Card You Have to Deposite Minimum 500Rs.\n==>");
		double money=scanner.nextDouble();
		
		while(money<=499)
		{
			System.out.println("You Deposited Minimum Ammount");
			System.out.print("Enter Again Amount More Than 500.Rs\n==>");
			money=scanner.nextDouble();
			if (money>=500)
			{
				super.AccBalance+=money;
				System.out.println("Deposited Succesful");
				this.account();
			}
		}
		super.AccBalance+=money;
		System.out.println("Deposited Succesful");
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
		System.out.println("Account Type :"+AccType);

		Random rand=new Random();
		this.AccNo=rand.nextInt(1000);

		System.out.println("Your Account No Is :"+AccNo);

		System.out.println("====================================================");
		System.out.println(" Your ==>==> "+AccType+" ==>==> Is Created ");
		System.out.println("====================================================");
		System.out.println(">>>>>>>> Your Account Balance Is :"+AccBalance+"Rs.+");
		System.out.println("=====================================================");
		System.out.println();

		System.out.println("====================================================");
		System.out.println("*************** Welcome To SBI Family ***************");
		System.out.println("====================================================");

		sbiOperations();
		
		

	}
	public void withdraw()
	{
		System.out.println("Enter Amount To Withdraw :");
		double money=scanner.nextDouble();

		System.out.println("Enter Your Atm Pin");
		int atmPin=scanner.nextInt();

		if (AccBalance>=money)
		{
			
			if (AtmPin==atmPin)
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
	public void deposite()
	{
		System.out.print("$$$$ Enter Ammount to Deposite $$$$\n==>");
		double money=scanner.nextDouble();
		super.AccBalance+=money;
		System.out.println("Deposited Succesful");
	}

	public void checkBalance()
	{
		System.out.println("====================================================");
		System.out.println(">>>>>>>> Your Account Balance Is :"+AccBalance+"Rs.+");
		System.out.println("=====================================================");
	}

	public void loan()
	{

	}

	public void sbiOperations()
	{
		System.out.print("What Operation to Want Perform");
		System.out.println("\n1.Withdraw Ammount \n2.Deposite Ammount \n3.Check Balance \n4.Go Back To Main Menu \n5.Exit");
		int choice=scanner.nextInt();
		
		boolean login=true;

		switch(choice)
		{
			case 1:{
					withdraw();
					break;
			}
			case 2:{
					deposite();
					break;
			}
			case 3:{
					this.checkBalance();
					break;
			}
			case 4:{
					MainDriver.menu();
					break;
			}
			case 5:{
					login=false;
					break;
			}
			default:
				System.out.println("....................................................");
				System.out.println(">>>>>>>>> You have Entered Wrong Choice <<<<<<<<<<");
				System.out.println(".....................................................");
		}
	}
}