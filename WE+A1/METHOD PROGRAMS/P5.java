import java.util.Scanner;
class P5 
{
	public static void cal(int a,char ch)
	{
		int lastdigit=a;
		if (ch=='s')
		{
			if (a%7==0)
			{
				System.out.println("Number Is Divisble");
			}
			else
			{
				System.out.println("Not Divisible");
			}
		}
		else 
		{
			if(a%10==7)
			{
				System.out.println(a+"Last Digit Is 7");
			}
			else
			{
				System.out.println(a+"Last Digit IS Not 7");
			}
		}
		
	}
	public static void cal(int a1,int b1,char ch1)
	{
		if (ch1=='g')
		{
			System.out.println(a1>b1?a1+"A IS Greatest":"B Is Greatest");
		}

	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The  Character");
		char ch=sc.next().charAt(0);
		System.out.println("Enter The First Digit");
		int a=sc.nextInt();
		cal(a,ch);
		

		System.out.println("Enter The First Digit");
		int a1=sc.nextInt();

		System.out.println("Enter The Second Digit");
		int b1=sc.nextInt();
		
		System.out.println("Enter The  Character");
		char ch1=sc.next().charAt(0);
		cal(a1,b1,ch1);

		//cal(17,'g');
		//cal(18,56,'g');
	}
}
