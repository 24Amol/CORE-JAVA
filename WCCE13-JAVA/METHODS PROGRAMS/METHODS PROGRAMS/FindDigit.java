class FindDigit 
{
	public static void FirstDigit(int num)
	{
		while (num>=10)
		{
					num=num/10;
		}

		System.out.println(num);
	}
	public static void LastDigit(int num)
	{
		num=num%10;
		System.out.println(num);
	}
	public static void main(String[] args) 
	{
			FirstDigit(4655);
			LastDigit(7468);
	}
}
