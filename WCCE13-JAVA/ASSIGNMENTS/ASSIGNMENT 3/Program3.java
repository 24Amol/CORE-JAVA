class Program3
{
	public static void main(String[] args) 
	{
		String str="java class";

		char ch[]=str.toCharArray();
		System.out.println(ch[0]);

		for (int i=0;i<str.length();i++ )
		{
			if (i==0 && ch[i]!= ' ' || ch[i]!= ' ' && ch[i-1]== ' ')
			{
				if (ch[i]>='a' && ch[i]<='z')
				{
					ch[i]=(char) (ch [i] - 'a' + 'A');
				}
				else if (ch[i]>='a' && ch[i]<='z')
				{
					ch[i]=(char) (ch [i] + 'a' - 'A');
				}
			}
		}

		String st=new String(ch);

		System.out.println(st);
	}
}