package ex_30_Exceptions;

public class Lab221_Try_Catch {
    public static void main(String[] args) {
       Integer a = 0;
       try {
           a = 10/0;
       }catch (ArithmeticException F){
           System.out.println("Error expected");
       }
        System.out.println(a);
    }
}
