class PrintUppercase 
{
	public static void main(String[] args) 
	{
		String str="MaHaraStra";

		System.out.println(str.length());

		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				System.out.println(str.charAt(i));
			}
		}
	}
}
