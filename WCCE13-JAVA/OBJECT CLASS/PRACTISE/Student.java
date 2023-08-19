class Student 
{
	int Math;
	int Science;

	Student(int sub1,int sub2)
	{
		this.Math=sub1;
		this.Science=sub2;

	}

	public int hashCode()
	{
		return Math;
	}
	public boolean equals(Object o)
	{
		Student temp=(Student)o;

		if (this.Math==temp.Math && this.Science==temp.Science)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Student student1=new Student(55,65);
		Student student2=new Student(55,90);

		if (student1.hashCode()==student2.hashCode())
		{
			System.out.println("Maths Subject Mark Is Same");
			if (student1.equals(student2))
			{
				System.out.println("Both Subjects Marks Are Same");
			}
			else
			{
				System.out.println("But Science Subject Mark is Different ");
			}
		}

	}
}
