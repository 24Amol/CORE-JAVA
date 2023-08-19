//QNO1=Write A Program To Store The First 10 Number And Print The Array

class ArrayPrintFirst10num
{
	public static void main(String[] args) 
	{
		int[] n=new int[10];
		int a=1;

		for (int index=0;index<n.length;index++)
		{
			n[index]=a++;
			System.out.println(n[index]);
		}
	}
}
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>1								*
-->>2								*
-->>3								*
-->>4								*
-->>5								*
-->>6								*
-->>7								*
-->>8								*
-->>9								*
-->>10								*
*************************************/