package ex16_Arrays;

public class Lab150_Arrays_SecondWayToCreate {
    public static void main(String[] args) {
        int[] marks = {1, 2, 3, 4, 5, 6, 7}; // normal way
        System.out.println(marks.length);

        int[] marks1 = new int[7]; // fixed size 7 that is 0 to 6
        marks1[0] = 1;
        marks1[1] = 2;
        marks1[2] = 3;
        marks1[3] = 4;
        marks1[4] = 5;
        marks1[5] = 6;
        marks1[6] = 7;
        System.out.println(marks1[6]);
    }
}
