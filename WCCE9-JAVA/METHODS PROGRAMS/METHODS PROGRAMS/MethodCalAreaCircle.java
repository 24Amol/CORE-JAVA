//QNO4=Design A Method To Calculate Area Of Circle

class MethodCalAreaCircle
{
	public static void calAreaCircle(int radius,double pi)
	{
		double area=pi*radius*radius;

		System.out.println("The Area Of Circle Is:-"+area);
	}

	public static void main(String[] args) 
	{
		calAreaCircle(5,3.14);
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>The Area Of Circle Is:-78.5					*
*************************************************/