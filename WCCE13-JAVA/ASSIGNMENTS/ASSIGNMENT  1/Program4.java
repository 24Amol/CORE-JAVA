interface QSpiders
{
	void testing();
}

interface JSpiders
{
	void developing();
}

class TestYantra
{
	void working()
	{
		System.out.println("Employee Is Working");
	}
}

class Employee extends TestYantra implements QSpiders,JSpiders
{
	public void testing()
	{
		System.out.println("Employee Is Testing The Software");
	}
	public void developing()
	{
		System.out.println("Employee Is Developing the Software");
	}
}

class Program4
{
	public static void main(String args[])
	{
		System.out.println("main Start");

		Employee oE=new Employee();
		oE.working();

		Employee Dev=new Employee();
		Dev.developing();

		Employee Test=new Employee();
		Test.testing();

	}
}
