public class MainMethod 
	{
    public static void main(String... args) {
        System.out.println("main(String[] args)");
		main("hi");
		main("hi","bye");
    }

    public static void main(String demo) {
      System.out.println("main(String arg1)");
    }

    public static void main(String arg1, String arg2) {
        System.out.println("main(String arg1, String arg2)");
    }
}