class Program2 
{
	public static void main(String[] args) 
	{
		String str1="javaclass";
		String str2="";
		String str3="";


		char ch[]=str1.toCharArray();
		//System.out.println(ch[0]);

		for (int i=6;i<str1.length();i++ )
		{
			str2+=(char) ((str1.charAt(i) -32));
		}

		for (int i=0;i<=5;i++ )
		{
			str3+=str1.charAt(i);
		}
		System.out.println(str3+str2);
		

	}
}