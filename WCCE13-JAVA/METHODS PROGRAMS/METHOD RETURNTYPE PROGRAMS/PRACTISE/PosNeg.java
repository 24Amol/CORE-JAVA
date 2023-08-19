class PosNeg 
{
	public static String posNeg(int num)
	{
		if (num>0)
		{
			return "POSITVIE";
		}
		else
		{
			return "NEGATIVE";
		}
	}
	public static void main(String[] args) 
	{
		String res=posNeg(5);
		System.out.println(res);
	}
}
