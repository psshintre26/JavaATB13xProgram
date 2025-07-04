package ex16_Arrays;

import java.util.Arrays;

public class Lab153_Arrays_Max_Min {

    public static void main(String[] args) {

        int[] array = {141, 262, 653, 94};
        Arrays.sort(array);
        //System.out.println(array[0);

        System.out.println("Array elements are" + Arrays.toString(array));
        System.out.println("Max array element is " + array[3]);
        System.out.println("Minimum array element is " + array[0]);

    }//Lab153_Arrays_Max_Min

} //Lab153_Arrays_Max_Min
