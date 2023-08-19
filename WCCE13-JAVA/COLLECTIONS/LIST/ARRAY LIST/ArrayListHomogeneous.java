import java.util.ArrayList;
class ArrayListHomogeneous
{
	public static void main(String[] args) 
	{
		ArrayList<String> oA=new ArrayList<String>();

		oA.add("Java");
		oA.add("C++");
		oA.add("Python");
		oA.add("HTML");
		oA.add("CSS");
		//oA.add(10);//CTE

		System.out.println(oA);

	}
}

/*
WE CAN MAKE ARRAYLIST TO BEHAVE LIKE HOMOGENOUS
<> WITH THE HELP OF OPERATOR <>
1]ANGULAR BRACKET
2]DIAMOND BRACKET
3]GENERICS

==>For that we have Mention that specific datatype name inside that Angular Bracket
==>It only accept that Mention Datatype Only
==>It Connot Accept other Datatype
*/