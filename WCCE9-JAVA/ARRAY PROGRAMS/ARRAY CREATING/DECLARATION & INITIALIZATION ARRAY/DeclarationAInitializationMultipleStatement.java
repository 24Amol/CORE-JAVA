//QNO2=Declaration And Initialization Array In Clone Multiple Statement

class DeclarationAInitializationMultipleStatement
{
	public static void main(String[] args) 
	{
		int [] n;
		n={1,2,3,4,5};//Declaration And Initialization Array Cannot Be Clone In Multiple Statement
		System.out.println(n);//WE get compile Time Error
	}
}
/************************************************************************************************************
-------------------------->>>>>>>>>>>>>>>>>OUTPUT>>>>>>>>>>>>>>>>-------------------------------------------*
*************************************************************************************************************
-->>DeclarationAInitializationMultipleStatement.java:8: error: illegal start of expression					*
                n={1,2,3,4,5};//Declaration And Initialization Array Cannot Be Clone In Multiple Statement	*
                  ^																							*
-->>DeclarationAInitializationMultipleStatement.java:8: error: not a statement								*
                n={1,2,3,4,5};//Declaration And Initialization Array Cannot Be Clone In Multiple Statement	*
                   ^																						*
-->>DeclarationAInitializationMultipleStatement.java:8: error: ';' expected									*
                n={1,2,3,4,5};//Declaration And Initialization Array Cannot Be Clone In Multiple Statement	*
                    ^																						*
-->>3 errors																								*
*************************************************************************************************************/