//QNO2=Working Of + Plus Operator
class PlusOperator
{
	public static void main(String[] args) 
	{
/*2*/			System.out.println(1+1);//Addition 2
/*98*/			System.out.println(1+'a');//It ADD 1 & ASCII Value Of 'a' 97 i.e 1+97=98
/*195*/			System.out.println('a'+'b');//It ADD ASCII Value Of 'a' & 'b' i.e 97+98=195
/*aA*/			System.out.println('a'+"A");//It Concat The i.e it Print aA
/*truefalse*/	System.out.println("true"+false);//It Concat i.e it Print truefalse
	}
}

/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>2								*
-->>98								*
-->>195								*
-->>aA								*
-->>truefalse						*
*************************************/