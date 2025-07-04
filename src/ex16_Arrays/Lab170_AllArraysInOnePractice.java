package ex16_Arrays;

import java.util.Arrays;

public class Lab170_AllArraysInOnePractice {
    public static void main(String[] args) {
        // ***********Declaraion of single dim array two types**********
        int[] array = {1, 2, 3, 4};
        int[] array1 = new int[4];

        //**********Declaraion of Multi dim array four types**********

        int[][] Multiarray = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        int[][] MultiArray1 = {{1, 2, 3}, {3, 4, 5}, {4, 5, 6}};

        int[][] Multiarray2 = new int[3][4];

        int[][] Multiarray3 = new int[2][2];
        //12 24
        //45 67
        Multiarray3[0][0] = 12;
        Multiarray3[0][1] = 24;
        Multiarray3[1][0] = 45;
        Multiarray3[1][1] = 67;

        //print single dimensional array
        System.out.print(Arrays.toString(array));

        //print multidimensional array
        for (int i = 0; i < Multiarray.length; i++) {
            for (int j = 0; j < Multiarray.length; j++) {
                System.out.print(Multiarray[i][j]);
            }
            System.out.println();

            //Print ***
        }
    }


}
