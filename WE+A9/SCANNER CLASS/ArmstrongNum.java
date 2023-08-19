import java.util.Scanner;
class ArmstrongNum 
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter The Number:-");
		int num=Sc.nextInt();

		int temp=num;
		int digit=0;
		int sum=0;
		int x=num;


		while (temp>0)
		{
			digit++;
			temp=temp/10;
		}
		while (x>0)
		{
			int lastDigit=x%10;
			int mul=1;

			for (int i=1;i<=digit;i++)
			{
				mul=mul*lastDigit;
			}

			sum=sum+mul;
			x=x/10;
		}
		if (num==sum)
		{
			System.out.println(num+" "+" is Armstrong Number");
		}
		else
		{
			System.out.println(num+" "+"  is Not Armstrong Number");
		}
	}
}
