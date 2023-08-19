
import java.util.ArrayList;

class ArrayListGet 
{
	public static void main(String[] args) 
	{
		ArrayList oA=new ArrayList();

		oA.add("Apple");
		oA.add("Ice-Cream");
		oA.add("Mango");

		System.out.println(oA.get(2));

	}
}
/*
==>get() is a non-Static Method
==> The ReturnType Is Dependds On its Datatype
==>Access Specific Index Element Inside the Array
*/