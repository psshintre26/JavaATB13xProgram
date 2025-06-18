package ex09_Switch;

import java.util.Scanner;

public class Lab084_SwitchWithNoBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the day 1 to 7");
        int iday = scanner.nextInt();

        switch (iday){

            case 1:
                System.out.println("You have entered number" + iday + "its monday");

            case 2:
                System.out.println("You have entered number" + iday + "its tuesday");

            case 3:
                System.out.println("You have entered number" + iday + "its wednesday");

            case 4:
                System.out.println("You have entered number" + iday + "its thrusday");

            case 5:
                System.out.println("You have entered number" + iday + "its friday");

            case 6:
                System.out.println("You have entered number" + iday + "its saturday");

            case 7:
                System.out.println("You have entered number" + iday + "its sunday");


            default:
                System.out.println("invalid");

        }




    }
}
