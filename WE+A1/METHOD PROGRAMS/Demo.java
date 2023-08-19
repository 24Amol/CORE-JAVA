class Demo
{
     public static double demo(int a)
	{
         int b=20;
         if(a<0 )
                    //f
          return a;//1 byte 8 bytes//control transfer statement
     else
          return b;//unreachable statement
     //return control is transferd to the caller
	}
     public static void main(String[] args) //paused, control is with the main method resume ||calling method/caller
	{                                 //parameterized method
      
         int b=129;
        System.out.println(demo(b));//68.0 double
          int c=79;//0
         //byte --1 byte=8 bits int 4 bytes 32bits no data loss 79
         System.out.println(demo(c));//79
     //11-128 to 127 128--->-128 129.---->-127 130--->-126
	}
}
