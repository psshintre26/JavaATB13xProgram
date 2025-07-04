package ex16_Arrays;

public class Lab163_2D_Right_Triangle {
    public static void main(String[] args) {
        //Print right angled triangle using arrays 2d below in next class Interview question
        //*
        //**
        //***
        int [][]star= {{0,0,0},{1,1,0},{2,2,2}};
        for (int i = 0; i < star.length ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
