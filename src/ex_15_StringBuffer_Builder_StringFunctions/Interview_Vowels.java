package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Formattable;
import java.util.Scanner;

public class Interview_Vowels {
    public static void main(String[] args) {
        // Write Java Program to Count Vowels and Consonants
        // pramod -> a,i,e,o,u -> V- 2, C- 4
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string from which volwels and consonents need to be counted");
        String name= scanner.next();
        name= name.toLowerCase();

        int sVowel = 0;
        int sConsonent = 0;

        for (int i = 0; i < name.length(); i++) {
           char ch= name.charAt(i);
            if (ch == 'a' || ch == 'e' ||ch =='i' || ch == 'o'|| ch == 'u') {
                sVowel++;

            }else{
                sConsonent++;
            }

        }
        System.out.println(" Total number of vowels are : "+sVowel+" And total number of consonenets are : "+sConsonent);
    }

}
