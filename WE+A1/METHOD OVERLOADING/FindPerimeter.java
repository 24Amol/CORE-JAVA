import java.util.Scanner;

class FindPerimeter 
{
	public static void periCircle(int radius)
	{
		double dPeri=2*3.15*radius;
		System.out.println("The Perimeter Of Circle:-"+dPeri);
	}
	public static void periSquare(int side)
	{
		double dPeri=4*side;
		System.out.println("The Perimeter Of Square iS:-"+dPeri);
	}
	
	public static void periRectangle(double length,double heigth)
	{
		double dPeri=2*(heigth+length);
		System.out.println("The Perimeter Of Rectangle Is:-"+dPeri);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice:- \n Circle:-Perimeter Of Circle \n Rectangle:-Perimeter OF Rectangle \n Square:-Perimeter Of Square");
		String Choice=sc.nextLine();
		boolean quit=false;
		do{
			switch (Choice)
			{
				case "Circle":{
					System.out.print("Please Enter The Radius Of Circle:-");
					int radius=sc.nextInt();
					periCircle(radius);
					break;
				}

				case "Square":{
					System.out.print("Please Enter The Side:-");
					int side=sc.nextInt();
					periSquare(side);
					break;
				}

				case "Rectangle":{
					System.out.println("Please Enter The Length:-");
					double length=sc.nextDouble();

					System.out.println("Please Enter The Height:-");
					double heigth=sc.nextDouble();

					periRectangle(heigth,length);
					break;
				}
				default :{
					System.out.println("You Have Entered Wrong Choice:-");
				}
			}
		}while(!quit);
		
	}
}