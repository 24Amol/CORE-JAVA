class A
{
	static int a;

	static {
		System.out.println("static a ");
	}
	static void demo(){
		System.out.println("Demo()");
	}
}
class B extends A
{
	
	static int a=10;

	static {
		System.out.println("static b ");
	}
	static void test(){
		System.out.println("test()");
	}
	
	public static void main(String[] args){
			
		System.out.println(a);//0  local--childclass--parentclass
		System.out.println(A.a);//0

		test();//test()
		demo();// own class ---> parent class -- sDemo()

	}

}