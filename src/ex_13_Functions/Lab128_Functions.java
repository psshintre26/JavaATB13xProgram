package ex_13_Functions;

import java.util.Scanner;

public class Lab128_Functions {
    public static void main(String[] args) {


        //builtin functions are the ones created by java
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        long i1 = scanner.nextInt();
        System.out.println("enter number 2");
        long i2 = scanner.nextInt();
        long imax = Math.max(i1, i2);
        System.out.println("Max number from " +i1+ "and" +i2+ "is :  "+imax);

    }
}