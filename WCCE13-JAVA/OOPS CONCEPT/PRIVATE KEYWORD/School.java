class School 
{
	public static void main(String[] args) 
	{
		Student oS=new Student("Amol","24/04/2000",45000);
		oS.getData();
		oS.display();//Here Private Members Are Accessible Beacuse The Display() Mehode
		//Is Member Of Student Class
		oS.strName="Ganesh";//Here We Are Trying To Modify The Data But We Can't
		//Beacuse Mebers Are Private
		//We Can't Modify Private Members
		System.out.println();
	}
}
