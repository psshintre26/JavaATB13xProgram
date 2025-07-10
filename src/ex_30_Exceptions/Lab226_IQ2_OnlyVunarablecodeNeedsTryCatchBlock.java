package ex_30_Exceptions;

public class Lab226_IQ2_OnlyVunarablecodeNeedsTryCatchBlock {

    public static void main(String[] args) {
        int c =0;
        int b = 0;
        try {
            b = 10/c; // Vulnerable Code that should be try and catch! not int c and int b in this case
        } catch (ArithmeticException e) { //not a good practice to include exception here it shows error too
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
