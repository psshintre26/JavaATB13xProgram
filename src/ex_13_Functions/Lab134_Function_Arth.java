package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        //create function of add, sub, mult, div of two number

        //get scanner input for two numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        long num1 = scanner.nextLong();
        System.out.println("Enter number 2: ");
        long num2 = scanner.nextLong();

        //add
        long sAdd= sAddition(num1,num2);
        System.out.println(sAdd);

        //sub
        long sSub= sSubtraction(num1,num2);
        System.out.println(sSub);

        //mult
        Long sM = sMulti(num1,num2);
        System.out.println(sM);

        //div
        Long sDiv= sdiv(num1,num2);
        System.out.println(sDiv);


    }
    static long sAddition(long i, long j){
        return i+j;
    }

    static long sSubtraction(long i, long j){
        if (i<j){
            return j-i;
        }else {
            return i - j;
        }
    }

    static long sMulti(long i, long j){
        return i*j;
    }

    static long sdiv(long i,long j){
        return i/j;

    }
}
