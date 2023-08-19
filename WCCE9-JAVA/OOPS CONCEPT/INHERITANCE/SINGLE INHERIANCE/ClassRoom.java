class Room 
{
	double dLength;
	double dWidth;
	
	Room()
	{
		dLength=0.0;
		dWidth=0.0;
	}
	Room(double l,double w)
	{
		dLength=l;
		dWidth=w;
	}
	void CalArea()
	{
		double dArea=dLength*dWidth;
		System.out.println("The Area Of Room="+dArea);
	}
	void putData()
	{
		System.out.println("The Length Of Room="+dLength);
		System.out.println("The Width Of Room="+dWidth);
	}
}

class ClassRoom extends Room
{
	double dHeight;

	ClassRoom()
	{
		super();
		dHeight=0.0;
	}

	ClassRoom(double l,double w,double h)
	{
		super(l,w);
		dHeight=h;
	}

	void CalVolumn()
	{
		double dVolumn=dLength*dWidth*dHeight;
		System.out.println("The Volumn Of ClassRoom="+dVolumn);
	}
	void putData2()
	{
		System.out.println("The Length Of ClassRoom:-"+dLength);
		System.out.println("The Width Of ClassRoom:-"+dWidth);
		System.out.println("The Height Of ClassRoom:-"+dHeight);
	}
	
	public static void main(String... args)
	{
		ClassRoom oC=new ClassRoom(3.5,4.5,5.5);
		oC.putData();
		System.out.println("=====================================================");
		oC.CalArea();
		System.out.println("=====================================================");
		oC.putData2();
		System.out.println("=====================================================");
		oC.CalVolumn();
		System.out.println("=====================================================");
	}
}
