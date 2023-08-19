class Demo 
{

	static int a=10;
	int b=20;

	static
	{
		System.out.println(a);//==>Local(NotPresent)==>Static(NotPresent)==>Nonstatic
														//Present//10
		int a=30;
		System.out.println(a);//==>Local(Present)#(NP)==>Static(NotPresent)==>Nonstatic//30
												
		System.out.println(Demo.a);//Directly Static Var ==>10
									//Class Name As Refernce
								
		Demo d=new Demo(); 
		System.out.println(d.b); //object reference variable =>20
		System.out.println(d.a); //Object Refernce Var =>10

	}

	{
		System.out.println(a); //d--a--s 10
		System.out.println(Demo.a); //CAR 10
		System.out.println(this.a);//using this keyword 10
		System.out.println(b);//d--l--s--ns 20
		System.out.println(this.b);//with help this keyword 20

	}

	public static void main(String[] args) 
	{
		
	}
}