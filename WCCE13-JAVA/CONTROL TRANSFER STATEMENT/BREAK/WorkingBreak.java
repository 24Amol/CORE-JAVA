//QNO2:-Write A Program Understand The Working Of Break keyword

class WorkingBreak 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");//1
		int a=0;

		while (a<5)/*{1}*//*{2}*/
		{
			System.out.println("Hi");//2//4
			
			if(a==2)/*{false}*//*{false}*//*{true}*/
			{
				System.out.println("GoodBye");//6
					a++;
				break;//It transfer The Control To End Of The Block
			}
			System.out.println("Bye");//3//5
			a++;
		}
		System.out.println("Main End");//7
	}
}

/*******************OUTPUT*******************/
//Main Start								*
//Hi										*
//Bye										*
//Hi										*
//Bye										*
//Hi										*
//GoodBye									*
//Main End									*
/********************************************/