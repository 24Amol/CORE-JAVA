import java.util.*;
class HashSetClass 
{
	public static void main(String[] args) 
	{
		HashSet obj=new HashSet();
		obj.add(123);
		obj.add("HashSet");
		obj.add(true);
		obj.add(true);
		obj.add(false);
		obj.add('a');

		System.out.println(obj);
	}
}
/*=>
=>HashSet is an Concreate Class In java 
=>HashSet does not allow duplication of data
*/