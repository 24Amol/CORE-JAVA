class FindMinimum
{

	public static void findMin(int a,int b,int c,int d)
	{
		System.out.println(a<b && a<c && a<d?a:b<c && b<d? b:c<d?c:d);
	}
	public static void main(String[] args) 
	{
		findMin(4,46,56,44);
	}
}
