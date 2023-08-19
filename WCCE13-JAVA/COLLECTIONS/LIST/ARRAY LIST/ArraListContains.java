// contains() METHOD
import java.util.ArrayList;

class ArraListContains
{
	public static void main(String[] args) 
	{
		ArrayList oA=new ArrayList();
		
		System.out.println(oA);

		oA.add("Jawa");
		oA.add("Pulsar");
		oA.add("Ninja");

		System.out.println(oA.contains("Jawa"));
	}
}
/* 
==>contains() Method it also Boolean Type Method
==>we can call Contain() method with the help of Object Refernce Variable
==>Inside contains Method we have to Pass the Element to Check
==>If that Element is Present in the ArrayList then it Return true
