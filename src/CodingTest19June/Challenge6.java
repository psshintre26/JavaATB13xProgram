package CodingTest19June;

import java.util.Scanner;

public class Challenge6 {
//    Number Classification
//    Write a program to check if a number is positive, negative, or zero.
//
//**Requirements:**
//            - Read an integer from user input
//- Use if-else statements to classify the number
//- Print appropriate message for each case
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter number");
    int inum = scanner.nextInt();
    if (inum>0){
        System.out.println("positive "+inum);
    } else if (inum==0) {
        System.out.println("zero "+inum);

    }else{
        System.out.println("negative "+inum);
    }

}
}
