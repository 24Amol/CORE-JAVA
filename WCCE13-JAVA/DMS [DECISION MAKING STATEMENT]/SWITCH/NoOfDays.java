class NoOfDays
{
	public static void main(String[] args) 
	{
		int Days=31;

		switch (Days)
		{
		case  30:
			System.out.println(" April "+" June "+" Septmber "+" November ");
		break;

		case 31:
			System.out.println("January "+" March "+" May "+" July "+" August "+" Octomber "+" December");
		break;

		case 28:
			System.out.println("Febuary");
		
		default:
			System.out.println("Enter Valid Value");
		}
		
	}
}
