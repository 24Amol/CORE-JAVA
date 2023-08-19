//QNO4:-Write A Program To Perform The Nesting Method Using The Non Static Method
class NonStaticNestingMethod
{

	void engineStarted()
	{
		System.out.println("Engine Is Started");
		carStarted();
	}
	void carStarted()
	{
		System.out.println("Car Is Started");
	}
	public static void main(String[] args) 
	{
		NonStaticNestingMethod oNSNM=new NonStaticNestingMethod();
		System.out.println("Lets' Drive");
		oNSNM.engineStarted();
	}
}
