import java.util.Scanner;

class BankDriver 
{
	static Scanner scanner=new Scanner(System.in);
	public static void createAccount() 
	{
		System.out.println();
		System.out.println("====================================================================");
		System.out.println(">>>>>>>>> ?? In Which Bank You Want To Create The Account ?? <<<<<<<<");
		System.out.println("====================================================================");
		System.out.print("\n1.SBI Bank \n2.Axis Bank \n3.ICICI Bank \n4.UNION Bank \n5.Bank Of Baroda \n6.Go Back To Main Menu \n7.Exit \n==>");
		int choice=scanner.nextInt();
		boolean input=true;
		switch(choice)
		{
			case 1: {
						SBIDriver sbiDriver=new SBIDriver();
						sbiDriver.details();
						break;
			}
			
			case 2:{
						break;
			}

			case 3:{
						break;
			}

			case 4:{
						break;
			}

			case 5:{
						break;
			}

			case 6:{
						MainDriver.menu();
						break;
			}

			case 7:{
						System.out.println("====================================================");
						System.out.println("*************** !!! SEE You Soon !!! ***************");
						System.out.println("====================================================");
						input=false;
						break;
			}
			default:
				System.out.println("....................................................");
				System.out.println(">>>>>>>>> You have Entered Wrong Choice <<<<<<<<<<");
				System.out.println(".....................................................");
				System.out.println("Please Enter Valid Choice");
				createAccount();
				
		}
	}
	public static void displayAccounts()
	{

	}
}
