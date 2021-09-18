import java.util.*;

// An exploration of basic input and output.
class BasicIO {

   // Reads and processes string input.
   public static void main(String[] args) {

      @SuppressWarnings("resource")
	Scanner stdin = new Scanner(System.in);
      int age = 18;
      System.out.println(age);
      int days = 365;
      int A = age*days;
      System.out.println(A);
      int height = 70;
      System.out.println(height);
      String date1 = "2021-9-18";
      System.out.println(date1);
      
      
      // get first input
      System.out.println("zhouzuoqian ");
      String name = stdin.nextLine();
      
      // display output on console
      System.out.println("your name is " + name);
      
   }  // method main

}  // class BasicIO
