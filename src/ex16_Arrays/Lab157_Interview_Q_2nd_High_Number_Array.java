package ex16_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {


    //find second largest number
    int[] num = {213,234,3465,45};
    Arrays.sort(num);
        System.out.println("array elements are: "+Arrays.toString(num));

        System.out.println("Second Largest Number is "+num[num.length-2]);



    }
}
