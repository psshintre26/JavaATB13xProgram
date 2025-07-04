package ex16_Arrays;

public class Lab156_SUM_OF_ARRAYS {
    public static void main(String[] args) {
    int [] numbers = {125,345,23423};
    int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum +numbers[i];
        }
        System.out.println(sum);
    }
}
