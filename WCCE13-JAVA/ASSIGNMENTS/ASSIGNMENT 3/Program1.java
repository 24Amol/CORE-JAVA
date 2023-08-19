class Program1
{
	public static void main(String[] args) 
	{
		String str1="java class";
		String str2= "";
		String str3="";

		char ch[] =str1.toCharArray();

		for (int i=0;i<3;i++ )
		{
			str2+=(char) ((str1.charAt(i) -32));
		}

		for (int i=3;i<str1.length();i++ )
		{
			str3+=str1.charAt(i);
		}

		System.out.println(str2+str3);

		
		
		/*ch[0]='j';
		ch[1]='a';
		ch[2]='v';
*/
		//System.out.println(ch);
	}
}