package ex16_Arrays;

import java.util.Arrays;

public class MyClassWorkArray {
    public static void main(String[] args) {
        int a=10;
        int[] marks = {99,98,97};
        System.out.println(marks.length);
        System.out.println(marks[1]);

        boolean[] ismarried={true,false,true};
// second way to declare array
        //int array[] a1 = new int[5];
        String[] names = new String[3];
        names[0] = "Pramod";
        System.out.println(names[0]);

        String[] names1 = {"palla","pramo","Luky"};

        int[] marks1 = {91,33,44,55};
        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }
            //sort arrays
            Arrays.sort(marks1);
            for (int i = 0; i < marks.length ; i++) {
                System.out.println(marks[i]);

                //sort arrays
                Arrays.sort(marks1);

            }
        //interview q = max elements within an array
        int maxar[] = {21,34,55,66,78};

    }
}
