//QNO2=Write A Program Demo Of Else If Ladder

class DemoElseIfLadder  
{
	public static void main(String[] args) 
	{
		int n=12;
			
		if (n%2==0 && n%5==0)
		{
			System.out.println("Hi");
		}
		else if (n%7!=0 && n%3!=0)
		{
			System.out.println("Bye");
		}
		else if (n%2==0 && n%9==0)
		{
			System.out.println("GoodBye");
		}
		else
		{
			System.out.println("Block");
		}
	}
}

/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>Block							*
************************************/