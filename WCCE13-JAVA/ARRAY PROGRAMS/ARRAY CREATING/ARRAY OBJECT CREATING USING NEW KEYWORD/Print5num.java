class Print5num 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[5];
		int a=0;

		for (int i=0;i<arr.length;i++)
		{
			arr[i]=a++;
			System.out.println(arr[i]);
		}
	}
}
