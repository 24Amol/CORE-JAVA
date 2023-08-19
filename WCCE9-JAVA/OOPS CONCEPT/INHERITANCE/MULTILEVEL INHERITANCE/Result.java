class Student 
{
	int iRollNo;
	String strName;

	Student()
	{
		iRollNo=0;
		strName="";
	}

	Student(int iR,String n)
	{
		iRollNo=iR;
		strName=n;
	}
}

class Test extends Student
{
	int iSub1,iSub2,iSub3,iSub4;

	Test()
	{
		iSub1=0;
		iSub2=0;
		iSub3=0;
		iSub4=0;
	}

	Test(int iR, String n,int s1,int s2,int s3,int s4)
	{
		super(iR,n);
		iSub1=s1;
		iSub2=s2;
		iSub3=s3;
		iSub4=s4;
	}
}

class Result extends Test
{
	String  strGrade;

	Result()
	{
		super();
		String strGrade;
	}

	Result(int r,String n,int s1,int s2,int s3,int s4,String g)
	{
		super(r,n,s1,s2,s3,s4);
		strGrade=g;
	}

	void display()
	{
		System.out.println("The Name Is:-"+strName);
		System.out.println("The Roll No Is:-"+iRollNo);
		System.out.println("The Subject 1 Mark Is:-"+iSub1);
		System.out.println("The Subjcet 2 Mark Is:-"+iSub2);
		System.out.println("The Subject 3 Mark Is:-"+iSub3);
		System.out.println("The Subject 4 Mark Is:-"+iSub4);
	
		int iTotal=iSub1+iSub2+iSub3+iSub4;
		System.out.println("The Total Mark IS:-"+iTotal);

		double dPer=iTotal/4;
		System.out.println("The Percentage IS:-"+dPer);;
		System.out.println("The Grade Is:-"+strGrade);
	}

	public static void main(String args[])
	{
		Result oR=new Result(24,"Amol",70,60,85,90,"A");
		oR.display();
	}
}