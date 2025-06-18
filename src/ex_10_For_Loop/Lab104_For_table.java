package ex_10_For_Loop;

import java.util.Scanner;

public class Lab104_For_table {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        //Scanner scanner = new scanner(System.in);
        int stable = scanner.nextInt();
        System.out.println("Please find the Table of " +stable+" is as below: ");
        //make a table of 9 = 9 * 1 = 9
        for (int i = 1;i<11;i++){

            System.out.printf("%d X %d = %d",stable,i,stable*i).println();

        }



    }
}
