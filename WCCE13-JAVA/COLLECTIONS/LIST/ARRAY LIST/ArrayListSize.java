
import java.util.ArrayList;

class ArrayListSize 
{
	public static void main(String[] args) 
	{
		ArrayList oA=new ArrayList();
		
		System.out.println(oA);

		oA.add("Apple");
		oA.add("Ice-Cream");
		oA.add("Mango");
			
		System.out.println(oA.size());
		
	}
}
/*
==>size() is Non-Static Boolean Type Method
==>We can Call the size method with the help of Object Reference Variable
==>size Methods Return Number of Count Element Present Inside the ArrayList
*/