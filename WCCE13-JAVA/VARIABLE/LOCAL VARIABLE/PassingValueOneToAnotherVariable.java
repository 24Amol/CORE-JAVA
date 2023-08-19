//QNO4:- Can We Pass Value One Variable To Another Variable
class PassingValueOneToAnotherVariable 
{
	public static void main(String[] args) 
	{
/*1*/	int a=1;
/*1*/	int b=a;//It Passes the Value A To B
/*1*/	int c=a;//It Passes the Value A To C
		System.out.println(a);//1
		System.out.println(b);//1
		System.out.println(c);//1
	}
}
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>1								*
-->>1								*
-->>1								*
*************************************/