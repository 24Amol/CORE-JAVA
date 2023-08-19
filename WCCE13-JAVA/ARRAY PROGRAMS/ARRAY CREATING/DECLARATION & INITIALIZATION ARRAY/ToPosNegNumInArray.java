//QNO6=Write A Program To Count The Positive And Negative Number In The Array And Print
class ToPosNegNumInArray 
{
	public static void main(String[] args) 
	{
		int n[]={1,-2,4,-7,9,10,12};

		int count=0;
		int a=0;
		

		for(int index=0;index<n.length;index++)
		{
			if (n[index]>0)
			{	
				count++;
				System.out.println(n[index]);
			}

		}
		System.out.println("Positvie Num Is:"+count);
	}
}
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>1								*			
-->>4								*
-->>9								*
-->>10								*
-->>12								*
-->>Positvie Num Is:5				*
*************************************/