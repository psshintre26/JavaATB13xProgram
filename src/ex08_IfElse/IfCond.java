package ex08_IfElse;


import java.util.Scanner;

public class IfCond {
    public static void main(String[] args) {
        System.out.println("what is your age");
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age>18){
            System.out.println("Allowd to vote!");


        } else if (age==18) {
            System.out.println("So Close Vote next year !");

        } else {
            System.out.println("not allowd to vote");
        }
    }
}
