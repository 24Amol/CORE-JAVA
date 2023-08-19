//QNO1=Design A Method To Print First 10 Characters

class DesignMethodPrintFirst10Char  
{

	public static void charactersPrint(char ch)
	{
		while(ch<='j')
		{
			System.out.println(ch);
			ch++;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(charactersPrint('a'));
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>a											*
-->>b											*
-->>c											*
-->>d											*
-->>e											*
-->>f											*
-->>g											*
-->>h											*
-->>i											*
-->>j											*
*************************************************/