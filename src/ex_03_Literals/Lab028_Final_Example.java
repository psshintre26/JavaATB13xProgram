package ex_03_Literals;

public class Lab028_Final_Example {


    public static void main(String[] args) {
        Method1();
        Method2();
    }

    private static void Method2() {
        //when declared final then the variable value can not be reassigned.
        final int local1 = 11;
        System.out.println(local1);
        //local1 = 223; //this gave error since local1 is final cant change its value

    }

    private static void Method1() {
        int local = 21;
        System.out.println(local);
        local = 22;
        System.out.println(local);

    }

}
