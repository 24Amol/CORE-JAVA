class AccessStaticVar 
{
	static int a=10;

	public static void main(String[] args) 
	{
		AccessStaticVar oASV=new AccessStaticVar();
		oASV.a=20;
		System.out.println(oASV.a);
	}
}
