//QNO2=Write A Program To Check Use Of Both Break & Continue Keyword Together Inside A Different Block

class BreakContinueDifferentLoop
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");//1
		int a=0;

		while (a<5)//*{0}
		{
			System.out.println("Hi");//2
			
			if(a==2)/*{false}*/
			{
				System.out.println("GoodBye");
					a++;
				continue;
			}
			System.out.println("Bye");//3
			a++;
			break;
		}
		System.out.println("Main End");//4
	}
}

//We Can Use The Both Keyword In Program The Diffrent Loops

/***********************OUTPUT***********************/
//Main Start										*
//Hi												*
//Bye												*
//Main End											*
/****************************************************/