interface Student 
{
	void data();
}
class Amol implements Student
{
	String name="Amol Pawar";
	int rollno=24;

	public void data()
	{
		System.out.println(name);
		System.out.println(rollno);
	}
}

class Program1
{
	public static void main(String[] args) 
	{
		Amol oA=new Amol();
		oA.data();
	}
}




