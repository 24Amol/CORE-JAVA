//QNO2:-Can We Perform Increment Operator For Float Datatype
class IncrementFloat
{
	public static void main(String[] args) 
	{
		float a=11.11f;
		float b=22.22f;
		float c=a++;
		float d=++b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>12.11							*
-->>23.22							*
-->>11.11							*
-->>23.22							*
*************************************/