class CheckNC 
{
	public static void add3(int a,int b,int c)
	{
		int res=a+b+c;
		System.out.println(res);
	}
	public static void checkVowel(char ch)
	{
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+":Given Character Is Vowel");
		}
		else
		{
			System.out.println(ch+":Given Character Is Not Vowel");
		}
	}
	
	public static void evenOdd(int num)
	{
		System.out.println(num%2==0?"Even":"Odd");
	}

	public static void max3num(int a,int b,int c)
	{
		System.out.println(a>b && a>c?a:b>c?b:c);
	}
	public static void posNeg(int num)
	{
		System.out.println(num>0?"POSITIVE":"NEGATIVE");
	}
	public static void printEven20(int n)
	{
		while (n<=20)
		{
			if (n%2==0)
			{
				System.out.println(n);
			}
			n++;
		}
	}
	public static void main(String[] args) 
	{
		printEven20(0);
		add3(3,5,8);
		checkVowel('a');
		evenOdd(4);
		max3num(12,55,5);
		posNeg(-5);
	}
}
