//QNO4=Write A Program to Store First Five Even Numbers In An Array And Print The Array
class PrintFirstFiveEvenNumStoreToArray
{
	public static void main(String[] args) 
	{
		int[] n=new int[10];

		int a=0;

		for (int index=0;index<n.length;index++)
		{
			n[index]=a++;
			
			if (n[index]%2==0)
			{
				System.out.println(n[index]);
			}
		}
	}
}
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>2								*
-->>4								*
-->>6								*
-->>8								*
-->>10								*
*************************************/