class ArrSummation 
{
	public static void main(String[] args) 
	{
		int[] arr={2,23,34,141,34,54,234};

		int Sum=0;

		for (int i=0;i<arr.length;i++)
		{
			Sum+=arr[i];
		}
		System.out.println("The Summation Array Is:-"+Sum);
	}
}
