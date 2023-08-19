//QNO3=Write A Program To Find Maximum Of Four Number If First Number Is Graeter Than Third Number Using Nested If Statement

class MaximunFourNum 
{
	public static void main(String[] args) 
	{
		int a=3,b=5,c=11,d=24;
		if (a>c)
		{
				if(a>b && a>c && a>d)
				{
					System.out.println(a +": A Is Greater");
				}
				else if (a>b && b>c && b>d)
				{
					System.out.println(b + ": B Is Greter");
				}
				else if (c>a && c>b && c>d)
				{
					System.out.println(c + ": C Is Greater");
				}
				else
				{
					System.out.println(d + ": D Is Greater");
				}
		}
		else
		{
			System.out.println(a+":-A Is Smaller");
		}	
	}
}
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
*3:-A Is Smaller					*
************************************/
