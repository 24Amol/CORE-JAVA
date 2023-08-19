//QNO4:-Write A Program To Check The Break Keyword Use Inside The Loop

class CheckInsideLoopBreak
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		int a=0;

		while (a<5)
		{
			System.out.println("Hi");
			
			if(a==2)
			{
				System.out.println("GoodBye");
				break;//We Can't Use break Inside The Loop
				a++;//We Get Compile Time Error
				
			}
			System.out.println("Bye");
			a++;
		}
		System.out.println("Main End");
	}
}

/*****************************OUTPUT**************************/
//CheckInsideLoopBreak.java:18: error: unreachable statement *	
//                                a++;						 *
/*************************************************************/