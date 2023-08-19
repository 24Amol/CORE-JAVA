import java.util.ArrayList;

class IndexOutOfBoundsExcep 
{
	public static void main(String[] args) 
	{
		
		ArrayList oA=new ArrayList();

		oA.add("Apple");
		oA.add("Sapota");
		oA.add("PineApple");
		oA.add("Mango");

		System.out.println(oA);
		System.out.println(oA.contains("Mango"));
		System.out.println(oA.size());

		System.out.println(oA.get(4));//Exception

	}
}
