class SignUp
{
	public static boolean verify(String n,String mN)
	{
		if (n=="Amol" && mN=="9373428581")
		{
			return true;
		}
		return false;
	}

    public static void signUp(String n,String mN)
	{
		if (verify(n,mN))
		{
			System.out.println("Login Successfully");
		}
		else
		{
			System.out.println("Unauthorized Access");
		}
	}

	public static void main(String[] args) 
	{
		signUp("Amol","9373428581");
	}
}
