class CountChar 
{
	public static void main(String[] args) 
	{
		char ch='A';
		int count=0;

		while (ch<='Z')
		{
			System.out.println(ch);
			ch++;
			count++;
		}
		System.out.println("The Character Is:-"+count);
	}
}
