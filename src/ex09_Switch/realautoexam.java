package ex09_Switch;

import java.util.Locale;
import java.util.Scanner;

public class realautoexam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name of browser:");
        String browser = scanner.next();
        browser = browser.toLowerCase();
        switch (browser){
            case "chrome":
                System.out.println("this is chrome");
                break;
            case "IE":
                System.out.println("this is IE");
            case "firefox":
                System.out.println("this is Firefox");

        }
    }
}
