//QNO2= Can We Initailize the Non Static Variable From the Non-Static Method
class InitializeNonStaticVar
{
	int a;
	int b;

	void display()
	{//Yes We Can Access The Non Static Varible
		a=5;
		System.out.println(a);//1:-Directly
		this.b=32;//2:-By Using This Keyword
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		InitializeNonStaticVar oINSV=new InitializeNonStaticVar();
		oINSV.display();
		System.out.println("Hello World!");
	}
}
