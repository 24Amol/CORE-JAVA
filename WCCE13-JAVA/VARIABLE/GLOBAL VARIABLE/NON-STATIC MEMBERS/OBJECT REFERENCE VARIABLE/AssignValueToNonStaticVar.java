class AssignValueToNonStaticVar 
{
	int a;
	public static void main(String[] args) 
	{
		AssignValueToNonStaticVar obj =new AssignValueToNonStaticVar();
		System.out.println(obj.a);
		obj.a=10;
		System.out.println(obj.a);
	}
}
