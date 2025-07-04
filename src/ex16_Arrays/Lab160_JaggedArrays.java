package ex16_Arrays;

public class Lab160_JaggedArrays {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrix.length);

        for (int i = 0; i < matrix.length ; i++) { //rows
            for (int j = 0; j < matrix.length; j++) { //columns
                //System.out.print(matrix[i][j]+"*");
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Print right angled triangle using arrays 2d below in next class Interview question
    //*
    //**
    //***



}
