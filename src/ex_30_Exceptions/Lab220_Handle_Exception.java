package ex_30_Exceptions;

public class Lab220_Handle_Exception {
    public static void main(String[] args) {
        int a = 10;
        try {
            a = 10/0;
        } catch (Exception e) {
            System.out.println("Arithmatic error"); //custom mesg
            System.out.println(e.getMessage());
        }
    }
}
