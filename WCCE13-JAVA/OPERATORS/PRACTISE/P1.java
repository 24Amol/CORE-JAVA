class P1 
{
	public static void main(String[] args) 
	{
		int a=300;
		int b= ++a + a++ + ++a - a++;
		boolean res=b>0;
		System.out.println(res);
	}
}
