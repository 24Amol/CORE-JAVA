class ReverseString 
{
	public static void main(String[] args) 
	{
		String str="java";

		String Rev= "";

		for (int r=0;r<str.length();r++)
		{
			Rev=str.charAt(r) + Rev;
		}

		System.out.println("Reverse String Is :"+Rev);
	}
}
