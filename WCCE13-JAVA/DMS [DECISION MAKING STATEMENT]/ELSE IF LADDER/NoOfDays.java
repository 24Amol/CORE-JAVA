class NoOfDays 
{
	public static void main(String[] args) 
	{
		 String str="Febuary";

		 if (str=="January"||str=="March"||str=="May"||str=="July"||str=="August"||str=="Octomber"||str=="December")
		 {
			 System.out.println(str+ " : It consist of 31 Days");
		 }
		 else if (str=="April"||str=="June"||str=="September"||str=="November")
		 {
			 System.out.println(str+ " : It consist of 30 Days");
		 }
		 else
		{
			System.out.println(str + ": It Consist Of 28 or 29 Days");
		}
	}
}
