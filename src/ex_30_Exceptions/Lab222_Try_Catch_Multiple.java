package ex_30_Exceptions;

public class Lab222_Try_Catch_Multiple {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            // This line will cause an ArrayIndexOutOfBoundsException
            int[] numbers = new int[5];
            System.out.println(numbers[10]);

            // This line would cause an ArithmeticException if the previous line didn't throw an exception
            int result = 10 / 0;
            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (Exception e) { // Catch-all for any other unexpected exceptions
            System.out.println("Caught a general Exception: " + e.getMessage());
        }finally{
            System.out.println("Finally block executed.");
        }
    }
}
