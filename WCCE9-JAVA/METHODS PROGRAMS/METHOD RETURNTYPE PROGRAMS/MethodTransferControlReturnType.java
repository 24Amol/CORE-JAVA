//QNO10:-Design A Method Print To Transfer The Control And Return A Value Back

class MethodTransferControlReturnType
{

	public static void amol(int money)
	{	
		int bet=money*2;
		System.out.println(money);
		System.out.println(bet);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hi");
		amol(200);
		System.out.println("Bye");
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>Hi											*
-->>200											*
-->>400											*
-->>Bye											*
*************************************************/