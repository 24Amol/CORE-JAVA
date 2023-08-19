class CountEven 
{
	public static void main(String[] args) 
	{
		int[] arr={2,5,10,6,7,12,8,9};

		System.out.println("Address"+arr);
		int count=0;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2==0)
			{
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println("The Number of Even Number In Array:-"+count);
	}
}
