//QNO2:-Write A Program Using Break Keyword In Switch Statement

class BreakSwitch
{
	public static void main(String[] args) 
	{
		int n=2;
		
		System.out.println("Main Start");

		switch (n%2)
		{
			case 0:{
					System.out.println("Even");//true It Printed Even
					break;//Stop The Execution Transfer The Control The End Of The Block
			}
			case 1:{
					System.out.println("Odd");			
			}
		}/*{Control Here}*/
		System.out.println("Main End");//It Printed The Printing statement
	}
}

//If The Switch Value Is Matches With Its case Value It Printed The That Case 0 Statement
//The Break Keyword Stop The Execution And Transfer The Control To The End Of The Block
//The The Printing Statement Is Executed

/*******************OUTPUT*******************/
//Main Start								*
//Even										*
//Main End									*
/********************************************/