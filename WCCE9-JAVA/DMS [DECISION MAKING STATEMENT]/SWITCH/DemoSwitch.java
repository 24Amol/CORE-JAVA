//QNO1=Write A Demo Program For Switch Statement

class DemoSwitch
{
	public static void main(String[] args) 
	{
		int n=3;
		switch (n%2)/*{Expression/Literals}*///In The Switch Block We Only Pass The Literals And Expression
		{
			case 0 : {
				System.out.println(n+"Even");
			}
			case 1: {
				System.out.println(n+":-Odd");
			}
		}	
	}
}

/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
*-->>3:-Odd							*
************************************/