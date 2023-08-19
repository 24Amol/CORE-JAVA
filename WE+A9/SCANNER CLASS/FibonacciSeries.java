import java.util.Scanner;

class FibonacciSeries 
{
	public static void main(String[] args) 
	{
	
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter the Last Range:- ");
		int num=Sc.nextInt();

		int var1=0;
		int var2=1;
		int var3=0;

		System.out.print(var1 + ", "+var2+", ");

		for (int i=2;i<num ;i++)
		{
			var3=var1+var2;
			var1=var2;
			var2=var3;
			System.out.print(var3+", ");
		}

	}
}
