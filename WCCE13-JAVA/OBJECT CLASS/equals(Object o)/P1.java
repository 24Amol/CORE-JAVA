class P1 
{
	public static void main(String[] args) 
	{
		P1 obj=new P1();
		P1 obj1=new P1();

		System.out.println(obj==obj1);//Compare Two Address of the Object
		System.out.println(obj.equals(obj1));//Compare two State of the Object
	}
}
