 class P1
{

	public static void main(String[] args){
	String s1="ABCD";
	System.out.println(s1.charAt(0));
	System.out.println(s1.charAt(2));


	try{
			
			try{
				int res =1/0;
			}
			catch(Exception e){
				System.out.println("hi");
			}
			System.out.println(s1.charAt(5));

		}
	finally{
		System.out.println("finally");
	}
	


	}
}
