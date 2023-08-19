//QNO1= Can We Access the Non Static Variable From the Non-Static Method
class AccessNonStaticVar
{
	int a=10;
	int b=20;

	void display()
	{//Yes We Can Access The Non Static Varible
		System.out.println(a);//1:-Directly
		this.b=35;//2:-By Using This Keyword
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		AccessNonStaticVar oANSV=new AccessNonStaticVar();
		oANSV.display();
		System.out.println("Hello World!");
	}
}
