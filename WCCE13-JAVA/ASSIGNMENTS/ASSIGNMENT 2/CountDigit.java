class CountDigit 
{
	public static void main(String[] args) 
	{
		String str="WWC13";

		System.out.println(str);

		int Digit=0;

		for (int r=0;r<str.length();r++)
		{
			if (str.charAt(r)>='0' && str.charAt(r)<='9')
			{
				System.out.println(str.charAt(r));
				Digit++;
			}
		}
		System.out.println("The Number Of Digit :"+Digit);
	}
}
