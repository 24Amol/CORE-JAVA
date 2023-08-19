import java.util.Scanner;
class PrimeNum 
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();

		int count=0;

		if (num==1)
		{
			count++;
		}
		else
		{
			for (int i=2;i<=num/2;i++)
			{
				if (num%i==0)
				{
					count++;
				}
			}
		}
		if (count==0)
		{
			System.out.println(num+" "+"Is A Prime Nummber");
		}
		else
		{
			System.out.println(num+" "+"Is Not Prime Number");
		}
	}
}
