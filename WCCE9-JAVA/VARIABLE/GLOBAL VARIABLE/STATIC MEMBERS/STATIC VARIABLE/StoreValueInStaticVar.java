//QNO6:-Store or Assign A Value In Static Varible Into Main Method
class StoreValueInStaticVar 
{
	static int n;
	public static void main(String[] args) 
	{
		System.out.println(n);//Directly
		System.out.println(StoreValueInStaticVar.n);//Class Name As Refernce

		//1:-Store Value Directly By Its Name
		n=100;
		System.out.println(n);

		//2:-Store Value By Its Class Name As A Reference
		StoreValueInStaticVar.n=200;
		System.out.println(StoreValueInStaticVar.n);
	}
}
/********************************************
--------------->>>>>OUTPUT>>>>--------------*
*********************************************
-->>0										*
-->>0										*
-->>100										*
-->>200										*
*********************************************/