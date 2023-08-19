class CalMarks 
{
	public static void main(String[] args) 
	{
		int Sub1=74,Sub2=77,Sub3=83,Sub4=77;
		int Total=Sub1+Sub2+Sub3+Sub4;

		double Per=((Total*100)/400);
	
		if (Per<35)
		{
			System.out.println(Per+" : Fail");
		}
		else if (Per>75)
		{
			System.out.println(Per+" : Distinction");
		}
		else if (Per>60)
		{
			System.out.println(Per+" : First Class");
		}
		else if (Per>50)
		{
			System.out.println(Per+" : Second Class");
		}
		else if (Per>35)
		{
			System.out.println(Per+" : Pass");
		}

	}
}
