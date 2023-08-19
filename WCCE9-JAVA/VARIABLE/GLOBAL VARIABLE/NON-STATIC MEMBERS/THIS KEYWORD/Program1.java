class Program1 
{
	
	Program1()
	{
		System.out.println(this);//This Keyword points To The current Object
	}
	public static void main(String args[])
	{
		Program1 oP1 =new Program1();
		Program1 oP2 =new Program1();
	
		//oP1.show();
	}
}
