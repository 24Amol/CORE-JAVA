//QNO1=Write A Program To Check Use Of Both Break & Continue Keyword Together Inside A Single Block

class BreakContinueTogetherSingleLoop
{
	public static void main(String[] args) 
	{
		int a=0;
		if (a==2)
		{
			System.out.println("GoodBye");
			break;//We Can't Use Break And Continue Keyword Together Inside A Single Loop
			continue;//We Get Compile Time Error
		}
		System.out.println("Hello World!");
	}
}

/****************************OUTPUT****************************/
//BreakContinue.java:11: error: break outside switch or loop  *
//                        break;							  *
//                        ^									  *
//BreakContinue.java:12: error: continue outside of loop	  *
//                        continue;							  *
/**************************************************************/