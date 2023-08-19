interface Vehicle
{
	void run();
}

class Bike implements Vehicle
{

	private int cc;
	private String brand;
	
	
	Bike(int cc,String brand){
		this.cc=cc;
		this.brand=brand;
	}
	
		
	public int getCc(){
		return  this.cc;//---directly---static cc----non static 
	}

	public void run()
	{
		System.out.println("Bike Is Running");
	}
	
	//150

	public void setCc(int cc){
		this.cc=cc;
	}

}
class BikeDriver
{
	public static void main(String[] args){
		
		Bike b1=new Bike(150,"Hero");
		//System.out.println(b1.cc);
		;;;;;;;;;;;;
		b1.setCc(230);
	
		System.out.println(b1.getCc());
								//230

	}
}