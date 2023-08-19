//QNO3:-Write A Program To Check The Break Keyword Use Inside The Class Block

class CheckInsideClassBlock
{	
	break;//We Can't Use Break Keyword Inside Class Block
	//We Only Use The Break Keyword In The Switch Or Loops At The End Of The Loop
	//We Get Compile Time Error Called /*{illegal start of type}*/
	public static void main(String[] args) 
	{		
		System.out.println("Hello World");
	}
}

/****************************OUTPUT*******************************/
//CheckInsideClassBlock.java:5: error: illegal start of type	 *
 //       break;												 *
/*****************************************************************/