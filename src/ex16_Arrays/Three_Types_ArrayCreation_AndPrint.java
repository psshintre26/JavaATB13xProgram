package ex16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Three_Types_ArrayCreation_AndPrint {
    public static void main(String[] args) {


        int[] num = {1, 2, 3, 4, 5, 6};
        System.out.println("Array elements "+ Arrays.toString(num));

        int[]num1= new int[6];

        for (int i = 0; i <num1.length ; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your number "+i);
            int inum = scanner.nextInt();
            num1[i] = inum;
        }
        System.out.println("Array 1 Elements are: "+Arrays.toString(num1));

        int[] num2= new int[3];
        for (int i = 0; i <num2.length ; i++) {
            num2[i]=i;
            System.out.println(i);
        }
        System.out.println("Array 2 elements are"+Arrays.toString(num2));
    }
}