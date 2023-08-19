class SummationEven 
{
	public static void main(String[] args) 
	{

		int[] arr={2,23,34,141,34,54,234};
		int sum=0;

		for (int i=0;i<arr.length;i++ )
		{
			if (arr[i]%2==0)
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}
}
