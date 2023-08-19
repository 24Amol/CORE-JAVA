import java.util.ArrayList;

import java.util.ArrayList;
class RemoveAll 
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();//1st
		obj.add(1);
		obj.add(true);
		System.out.println(obj);

		ArrayList obj1=new ArrayList();//2nd
		obj1.add(2);
		obj1.add(true);
		System.out.println(obj1);


		obj1.removeAll(obj);

		System.out.println(obj1);
		System.out.println(obj);




	}
}
