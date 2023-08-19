class P1 
{
	public static void main(String[] args) 
	{
		P1 obj=new P1();
		System.out.println(obj.hashCode());//hahcode() called Explicitly

		P1 obj1=new P1();
		System.out.println(obj1.hashCode());//hahcode() called Explicitly
	}
}
