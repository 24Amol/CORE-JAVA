class Frontend 
{
	public void responsive(String str1,String str2)
	{
		System.out.println(str1+" & "+str2+" Is used to Backend Language");
	}
}

interface Backend
{
	//abstarct class
	public void connServer();
}

class Language extends Frontend implements Backend
{
	String strLang;
	public void print(String l)
	{
		this.strLang=l;
	}
	public void connServer()
	{
		this.print("Php");
		System.out.println(strLang+" Is used to Backend Language");
	}
}

class MultipleInheri
{
	public static void main(String[] args) 
	{
		Language oL=new Language();
		oL.connServer();
		oL.responsive("HTML","CSS");
	}
}