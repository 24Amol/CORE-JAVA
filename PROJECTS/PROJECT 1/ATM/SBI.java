/**************************************************************************************
============================= SBI BANK ================================================
***************************************************************************************/
abstract class SBI implements ATM,Bank
{
	
	String Name;
	int Age;
	long PhonNo;
	String AccType;
	double LoanAmm;

	double Deposite;
	double withdraw;

	double AccBalance;
	static int AtmPin;

	static int AccNo;		
}