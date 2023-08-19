import java.util.Scanner;

class ATMDriver
{
	public void atmServices()
	{
		SBIDriver sbiDriver=new SBIDriver();

		Scanner scanner=new Scanner(System.in);
		System.out.println("=============================================");
		System.out.println(">>>>>>>>>> Welcome To ATM Service >>>>>>>>");
		System.out.println("=============================================");
		System.out.print("Enter Your Choice \n1.Withdraw \n2.Check Balance \n==>");
		int choice=scanner.nextInt();
		System.out.println();
		switch(choice)
		{
			case 1:
				System.out.print(">>>>>>>>>>> Enter Your ATM Pin <<<<<<<< \n==>");
				int atmPin=scanner.nextInt();

				if(sbiDriver.AtmPin==atmPin)
				{
					System.out.println("Authorization Successful");
					sbiDriver.withdraw();
				}
				/*else if(Axis.AccNo==accNo)
				{
					Axis axis=new Axis();
					axis.withdraw();
				}
				else if(ICICI.AccNo==accNo)
				{
					ICICI icici=new ICICI();
					icici.withdraw();
				}
				else if(Baroda.AccNo==accNo)
				{
					
					Baroda baroda=new Baroda();
					baroda.withdraw();
				}*/
				else
				{
					System.out.println();
					System.out.println("============================================================");
					System.out.println(">>>>>>>>>> This Account Is Does Not Exist <<<<<<<<<<<");
					System.out.println("============================================================");
					System.out.println();
				}
				break;

			case 2:
				sbiDriver.checkBalance();
		}
	}
}
