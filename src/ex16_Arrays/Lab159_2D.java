package ex16_Arrays;

import java.util.Arrays;

public class Lab159_2D {
    public static void main(String[] args) {
        //123
        //456
        //789
        int [][] twoDIMArray = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //System.out.println(Arrays.toString(twoDIMArray));
        //10,20,30
        //40,50,60
        //70,80,90

        int [][]twoDimArray1 = {
                {10,20,30}, {40,50,60}, {70,80,90}
        };

        //System.out.println(Arrays.toString(twoDimArray1));

        int [][] another2Dway = new int [3][3]; //below array is created
        // 000
        //000
        //000
        another2Dway[0][0] = 1;
        another2Dway[0][1] = 2;
        another2Dway[0][2] = 3;


        another2Dway[1][0] = 4;
        another2Dway[1][1] = 5;
        another2Dway[1][2] = 6;

        another2Dway[2][0] = 7;
        another2Dway[2][1] = 8;
        another2Dway[2][2] = 9;






    }
}
