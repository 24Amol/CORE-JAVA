import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;

class TreeSetClass 
{
	public static void main(String[] args) 
	{

		TreeSet obj=new TreeSet();

		obj.add(1);
		obj.add('A');
		obj.add(true);
		obj.add(10.11);
		obj.add(224);
		//obj.add(3,"Amol");//add(value,object) CTE NOT WORKING

		System.out.println(obj.isEmpty());
		System.out.println(obj);

		System.out.println(obj.contains("Amol"));
		
		System.out.println(obj.size());

		//System.out.println(obj.get(2));//CTE get() NOT WORKING

	
		System.out.println(obj.remove(3));
		System.out.println(obj);


		System.out.println(obj.remove(Integer.valueOf(224)));
		System.out.println(obj);

		TreeSet obj1=new TreeSet();//2nd 
		obj1.add('a');
		obj1.add(true);
		
		//System.out.println(obj1);
		//obj1.removeAll(obj);
		//System.out.println(obj1);

		System.out.println(obj1);
		obj1.retainAll(obj);
		System.out.println(obj1);

		TreeSet obj3=new TreeSet();
		obj3.add(1);
		obj3.add(5);
		obj3.add(38);
		obj3.add(7);
		obj3.add(4);



		//Collections.sort(obj3);//NOT WORKING
		System.out.println("The Sorted Order Is:-"+obj3);

		//Collections.reverse(obj3);//NOT WORKING
		System.out.println("The Reverse Order:"+obj3);

		
		
		TreeSet obj4=new TreeSet();
		obj4.add(1);
		obj4.add("Amol");
		obj4.add('A');
		obj4.add(10.11);
		obj4.add(true);

		for(Object var : obj4)
		{
			System.out.println(var);
		}
		
		Iterator var=obj4.iterator();

		while (var.hasNext())
		{
			System.out.println(var.next());
		}


	}
}
