//QNO3:-Write A Program To Check The Continu Keyword Use Inside The Main Method

class CheckInsideMainMethodContinue
{
	public static void main(String[] args) 
	{		
		System.out.println("Hello World");
		continue;//We Can't Use Break Keyword Inside The Main Method
		//We Only Use The Break Keyword In The Switch Or Loops At The End Of The Loop
		//We Get Compile Time Error Calles /*{break outside switch or loop}*/
	}
}

/***********************************OUTPUT***************************************/
//CheckInsideMainMethodContinue.java:8: error: continue outside of loop			*
//                continue;//We Can't Use Break Keyword Inside The Main Method  *
//                ^																*
//1 error																		*
/********************************************************************************/