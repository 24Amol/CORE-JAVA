class Books 
{
	int iBookID=0;
	String strName="";
	private String strAuthorName="";
	private float fPrice=0.0f;

	Books(int ID,String Name,String AN,float Price)
	{
		iBookID=ID;
		strName=Name;
		strAuthorName=AN;
		fPrice=Price;
	}
	void display()
	{
		System.out.println("The Book Name Is:"+strName);
		System.out.println("The Book Author Name:"+strAuthorName);
		System.out.println("The Book ID IS:"+iBookID);
		System.out.println("The Book Price Is:"+fPrice);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
