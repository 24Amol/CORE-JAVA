import java.util.ArrayList;

class AddArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList oA=new ArrayList();
		
		System.out.println(oA);

		//We can add Element in ArrayList Using add() Method
		oA.add(4);
		oA.add("Apple");
		oA.add('A');
		oA.add(11.11);

		System.out.println(oA);

	}
}
