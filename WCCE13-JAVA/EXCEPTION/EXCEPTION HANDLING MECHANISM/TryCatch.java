class TryCatch
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;

		try
		{
			int res=a/b;//ArithematicException 
		}
		catch (ArithmeticException e)//Handling ArithematicException
		{
			e.printStackTrace();
		}
	}
}
