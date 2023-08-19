class Rectangle 
{
	double dlength,dwidth;

	Rectangle()
	{
		this.dlength=0.0;
		this.dwidth=0.0;
	}
	Rectangle(double s)
	{
		this();//Calling Default Constructor
		this.dlength=s;
	}
	Rectangle(double dlenght,double dwidth)
	{
		this(dlenght);//Calling Parameterized Constructor
		this.dwidth=dwidth;
	}
	void display()
	{
		System.out.println("Lenght Of Rectangle ="+this.dlength);
		System.out.println("Width Of Rectangle="+this.dwidth);
	}

	void calArea()
	{
		double dArea=this.dlength*dwidth;
		System.out.println("The Area Of Rectangle="+dArea);
	}

	public static void main(String[] args) 
	{
		Rectangle oR=new Rectangle(40,50);
		oR.display();
		oR.calArea();
		System.out.println("Hello World!");
	}
}
