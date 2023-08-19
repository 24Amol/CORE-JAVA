import java.io.*;
class P2 
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);

		}
		finally{
				System.out.println("File Is Created");
		}

	}
}