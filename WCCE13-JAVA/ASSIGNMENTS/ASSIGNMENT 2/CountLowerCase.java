class CountLowerCase 
{
	public static void main(String[] args) 
	{
		String str="JavaClass";

		System.out.println(str);

		int count=0;

		for (int r=0;r<str.length();r++)
		{
			if (str.charAt(r)>='a' && str.charAt(r)<='z')
			{
				System.out.println(str.charAt(r));
				count++;
			}
		}
		System.out.println("The Number Of Lowercase Letteres :"+count);
	}
}
