class MinimumFourNum
{
	public static void main(String[] args) 
	{
		int a=24;
		int b=11;
		int c=5;
		int d=3;
		String res=a<b && a<c && a<d?"A Is Smaller":b<a && b<c && b<d?"B Is Smaller":c<a && c<b && c<d?"C Is Smaller":"D Is Smaller";
		System.out.println(res);
	}
}
