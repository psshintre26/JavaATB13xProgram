package ex09_Switch;

import ex08_IfElse.scanner;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sbrowser = scanner.next();
        //sbrowser = sbrowser.toLowerCase();
        System.out.println("Please enter the browser name on which you want to perform tests -" +sbrowser);
        switch(sbrowser){

            case "IE" :
                System.out.println("Starting the IE");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "Chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "edge":
                System.out.println("Starting the edge");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            default:
                System.out.println("invalid");
                break;

        }
    }
}
