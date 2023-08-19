interface Vehicle
{
	void run();
}

class Bike implements Vehicle
{

	private int cc;
	private String brand;
	
	int speed;
	
	
	Bike(int cc,String brand,int s){
		this.cc=cc;
		this.brand=brand;
		this.speed=s;
	}
	
		
	public int getCc(){
		return  this.cc;//---directly---static cc----non static 
	}
	

	public void setCc(int cc){
		this.cc=cc;
	}

	public void run()
	{
		System.out.println("Bike Is Running on Speed "+speed+"Km");
	}

}
class Encapsulation
{
	public static void main(String[] args){
		
		Bike b1=new Bike(150,"Hero",100);
		//System.out.println(b1.cc);
		;;;;;;;;;;;;
		b1.setCc(230);
	
		System.out.println(b1.getCc());
								//230

		Vehicle oV=b1;
		oV.run();
	}
}