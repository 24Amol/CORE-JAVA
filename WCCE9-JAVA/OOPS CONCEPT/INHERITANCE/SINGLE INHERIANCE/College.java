class Student 
{
	String stName;
	String stDob;
	String stID;
	double stFee;

	Student()
	{
		System.out.println("**************The Student Details Are:-******************");
	}
	
	public void getData()
	{
		System.out.println("The Student Name Is:-"+stName);
		System.out.println("The Student DOB IS:-"+stDob);
		System.out.println("The Student ID IS:-"+stID);
		System.out.println("The Student Fee IS:-"+stFee);
	}

}

class College extends Student
{
	College(String name,String dob ,String ID,double fee)
	{
		stName=name;
		stDob=dob;
		stID=ID;
		stFee=fee;
	}
	public static void main(String... args)
	{
		College oC=new College("Amol","24/04/2000","24",45000);
		oC.getData();
	}

}
