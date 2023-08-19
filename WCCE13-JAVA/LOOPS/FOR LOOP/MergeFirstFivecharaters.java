//QNO13:-Write A Program To First Five Characters Using For Loop

class MergeFirstFivecharaters
{
	public static void main(String[] args) 
	{
		String str="";
		for (char ch='a';ch<='e';ch++)
		{
			str+=ch;
		}
		System.out.println("String is :"+str);
	}
}
/********************************************
--------------->>>>>OUTPUT>>>>--------------*
*********************************************
-->>String is :abcde						*
*********************************************/