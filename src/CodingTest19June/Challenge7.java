package CodingTest19June;

import java.util.Scanner;

public class Challenge7 {
  //  'Create a program to find the largest of three numbers. '
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter your first number ");
      int i1 = scanner.nextInt();System.out.println("Enter your second number ");int i2 = scanner.nextInt();System.out.println("Enter your third number ");int i3 = scanner.nextInt();
      if (i1 >= i2 && i1<= i3 ){
          System.out.println("largest number is first number : "+i1 );
      } else if (i2>=i1 && i2>i3) {
          System.out.println("largest number is second :"+i2);
      }
      else {
          System.out.println("largest number is third "+i3);
      }
  }
}
