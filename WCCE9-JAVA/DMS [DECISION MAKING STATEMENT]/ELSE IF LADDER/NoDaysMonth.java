//QNO3=Write  AProgram To Print Number Of days Present In The Given Month Using Else If Ladder

class NoDaysMonth 
{
	public static void main(String[] args) 
	{
		String ch="Febuary";
		if (ch=="January" || ch=="March" || ch=="May" || ch=="July" || ch=="August" || ch=="October" || ch=="December")
		{
			System.out.println(ch + ":- Consist Of 31 Days");
		}
		else if (ch=="April" || ch=="June" || ch=="September" || ch=="November")
		{
			System.out.println(ch + ":- Consist Of 30 Days");	
		}
		else if(ch=="Febuary")
		{
			System.out.println(ch + ":-Consist Of 28 Or 29 Days");
		}
		else
		{
			System.out.println("You Enetered Wrong Month");
		}
	}
}

/*************************************
--------->>>>>OUTPUT>>>>-------------*
**************************************
-->>Febuary:-Consist Of 28 Or 29 Days*
**************************************/