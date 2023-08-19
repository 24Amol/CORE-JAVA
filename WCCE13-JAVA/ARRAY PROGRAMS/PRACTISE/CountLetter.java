class CountLetter 
{
	public static void main(String[] args) 
	{
		char[] arr={'A','a','B','b','C','c','f'};
		int Ucount=0;
		int Lcount=0;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]>='A' && arr[i]<='Z')
			{
				Ucount++;
			}
		}
		System.out.println("The Uppercase Letter Is:-"+Ucount);

		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]>='a' && arr[i]<='z')
			{
				Lcount++;
			}
		}
		System.out.println("The Lowercase Letter Is:-"+Lcount);
	}
}
