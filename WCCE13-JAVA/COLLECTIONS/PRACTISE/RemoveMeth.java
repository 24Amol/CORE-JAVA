import java.util.ArrayList;
class RemoveMeth
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();

		obj.add(123);
		obj.add('A');
		obj.add(true);
		obj.add(false);
		System.out.println(obj);

		//Remove objects using the with the help of index_value
		obj.remove(1);
		System.out.println(obj);

		//Remove objects using the objects Name
		obj.remove(false);
		System.out.println(obj);

	}
}
