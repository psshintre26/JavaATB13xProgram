package ex09_Switch;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter days from 1 to 7");
int day = scanner.nextInt();

switch (day){

    case 1:
        System.out.println("monday");
        break;

        case 2:
            System.out.println("tuesday");


    default:
        System.out.println("not allowd");


}
    }
}
