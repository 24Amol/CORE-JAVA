import java.util.Vector;

class IndexOutOfBoundsExcep 
{
	public static void main(String[] args) 
	{
		
		Vector oV=new Vector();

		oV.add("Apple");
		oV.add("Sapota");
		oV.add("PineApple");
		oV.add("Mango");


		System.out.println(oV);
		System.out.println(oV.contains("Mango"));
		System.out.println(oV.size());

		System.out.println(oV.get(4));//Exception

	}
}
