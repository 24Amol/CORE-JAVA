class SimpleInterest
{
	public static void si(float p,float r,float t)
	{
		float Si=(p*r*t)/100;
		System.out.println(Si);
	}
	public static void main(String[] args) 
	{
		si(10000,5,5);
	}
}
