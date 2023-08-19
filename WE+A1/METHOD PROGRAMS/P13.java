class P13 
{
	public static void main(String[] args) 
	{
		int n=5;
		int j=n++ + --n + n-- + ++n;
		while (j++<6)
		{
			System.out.println("First Term");
			n++;
			j++;
		}
		System.out.println(j);
		System.out.println(n);
	}
}