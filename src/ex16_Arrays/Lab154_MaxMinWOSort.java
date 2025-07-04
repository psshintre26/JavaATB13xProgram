package ex16_Arrays;

public class Lab154_MaxMinWOSort {
    public static void main(String[] args) {

        int[] numbers= {11,4,27,3,5};
        //int[] number = new int[4];
        int smin = numbers[0];
        int smax = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (smin > numbers[i]){
                smin = numbers[i];
            }
            if (smax <numbers[i]){
                smax = numbers[i];
            }
             }
        System.out.println("min buber from array is "+smin);
        System.out.println("max buber from array is "+smax);

    }
}
