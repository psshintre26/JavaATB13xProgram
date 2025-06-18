package ex09_Switch;

import java.util.Scanner;

public class CP_checkVowel {
    public static void main(String[] args) {
        System.out.println("Enter any single character");
        Scanner scanner = new Scanner(System.in);
        char schar = scanner.next().toLowerCase().charAt(0);
        switch(schar){
            case 'a','e','i','o','u' -> System.out.println("You have entered vowel "+schar);

            default -> System.out.println(schar+ "  is a Consonent");

        }
    }
}
