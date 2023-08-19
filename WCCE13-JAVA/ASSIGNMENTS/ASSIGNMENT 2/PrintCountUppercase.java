class PrintCountUppercase
{
	public static void main(String[] args) 
	{
		String str="MaHaRasTra";

		System.out.println(str);


		int count=0;

		for (int r=0;r<str.length();r++)
		{

			if (str.charAt(r)>='A' && str.charAt(r)<='Z')
			{
				System.out.println(str.charAt(r));
				count++;
			}
		}
		System.out.println("The Number Of Uppercase Character In String :"+count);
	}
}
