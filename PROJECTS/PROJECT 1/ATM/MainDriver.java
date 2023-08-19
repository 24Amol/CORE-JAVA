import java.util.Scanner;

class MainDriver
{
	static Scanner scanner=new Scanner(System.in);
	public static void main(String args[])
	{
		
		menu();

	}

	public static void menu()
	{
		System.out.println("=============================================");
		System.out.println(">>>>>>>>>>> BANK MANAGEMENT SYSTEM >>>>>>>>>>");
		System.out.println("============================================");
		System.out.println("************ Enter Your Choice **************");
		System.out.println("============================================");
		System.out.print("\n1.Create An Account \n2.Display All Account \n3.Change The ATM Pin \n4.ATM \n5.Exit \n==>");
		int choice=scanner.nextInt();

		boolean input=true;
		
		switch(choice)
		{
			case 1:{
					BankDriver.createAccount();
					break;
			}
				
			case 2:{
					BankDriver.displayAccounts();
					break;
			}

			case 3:{
				
					break;
			}

			case 4:{
						ATMDriver atmDriver=new ATMDriver();
						atmDriver.atmServices();
					break;
			}

			case 5:{
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
				menu();
		}
	}
}