package ex16_Arrays;

import java.util.Arrays;
import java.util.List;

public class Lab152_Arrays_Print {
    public static void main(String[] args) {
        int [] marks2 = new int[3];
        System.out.println("Length of marks is " + marks2.length);
        int[] marks1 = {1,2,3,4};
        System.out.println("Length of marks1 is " +marks1.length);
        for (int i = 0; i < marks1.length ; i++) {
            System.out.println(marks1[i]);

        }
        int[] marks = {51, 100, 91, 87, 90};

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }
        Arrays.sort(marks);
//        for (int i = 0; i < marks.length ; i++) {
//            System.out.println(marks[i]);
//        }
//       List test = Arrays.asList(marks);
//        System.out.println(test);
    }
}
