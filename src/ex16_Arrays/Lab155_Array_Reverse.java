package ex16_Arrays;

import java.util.Arrays;

public class Lab155_Array_Reverse {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        // 5,4,3,2,1
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        System.out.println("Array Numbers elements: "+ Arrays.toString(numbers));

        String[] names= {"ss","pp","oo","shsh"};
        for (int i = 0; i < names.length ; i++) {
            System.out.println("Array element < "+i+"> is " +names[i]);

        }
        System.out.println(Arrays.toString(names));
    }
}
