//QNO2=Design A Method To Calculate The Cube Of Given Number And Return The Value Back Print The Result

class CalCubeNumReturnResult
{
	public static int calCube(int num)
	{
		int cube=1;
		for (int i=1;i<=3;i++)
		{
			cube*=num;
		}
		return cube;
	}
	public static void main(String[] args) 
	{
		System.out.println(calCube(5));
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>Test(int)									*
*************************************************/