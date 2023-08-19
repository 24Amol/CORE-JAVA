class FindCube
{
	public static void findCube(int num)
	{
		int Cube=1;
		for (int i=1;i<=3;i++)
		{
			Cube*=num;
		}
		System.out.println(Cube);
	}
	public static void main(String[] args) 
	{
		findCube(3);
	}
}
