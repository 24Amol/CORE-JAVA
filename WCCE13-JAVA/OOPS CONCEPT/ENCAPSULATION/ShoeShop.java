class Shoe 
{
	//non static variables which having private access modifire
	private String brand;
	private String color;
	private String type;
	private double price;
	private int size;

	//parameterized constructor
	Shoe(String brand,String color,String type,double price,int size){
		this.brand=brand;
		this.color=color;
		this.type=type;
		this.price=price;
		this.size=size;
	}

	//getters for all the non static private variables
	
	public String getBrand(){
		return brand;
	}
	public String getColor(){
		return color;
	}
	public String getType(){
		return type;
	}
	public double getPrice(){
		return price;
	}
	public int getSize(){
		return size;
	}

	
	//setters for all the non static private varibales

	public void setBrand(String brand){
		this.brand=brand;
	}
	public void setColor(String color){
		this.color=color;
	}
	public void setType(String type){
		this.type=type;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public void setSize(int size){
		this.size=size;
	}
	
	//non static method 
	public void shoeDetails(){
		System.out.println("--------ShoeDetails--------");
		System.out.println("Brand : "+brand);
		System.out.println("Color : "+color);
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
		System.out.println("Size : "+size);
	}

}
class ShoeShop
{

	public static void main(String[] args){
		
		Shoe s1=new Shoe("Reebok","White","RunningShoes",5107,8);
		
		s1.shoeDetails();

		//System.out.println(s1.price);//private members we can not access from one class to another class
		System.out.println("---------------------------");
		System.out.println(s1.getBrand()); 
		System.out.println(s1.getPrice());

		s1.setSize(6); //upadting private variable with help of setter method
		
		s1.shoeDetails();

		s1.setSize(11);
		s1.setColor("Red");
		s1.setType("Sports");
		s1.setPrice(555);

		s1.shoeDetails();


	
	}

}