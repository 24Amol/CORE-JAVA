class Subscriber
{

	private String email;
		
	Subscriber(String email)
	{
		this.email=email;
	}

	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email=email;
	}

}
class Youtube
{
	public static void main(String[] args){
		
		Subscriber s1=new Subscriber("rushimisal5@gmail.com");

		//System.out.println(s1.email);//CTE

		//s1.email="SarishMore@909eoh";//CTE
		
		System.out.println(s1.getEmail());
		s1.setEmail("SarishMore12@gmail.com");
		System.out.println(s1.getEmail());
	}

}