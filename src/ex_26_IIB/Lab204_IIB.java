package ex_26_IIB;

public class Lab204_IIB {
    public static void main(String[] args) {
        new A2();
    }
}
class A2{
    //dc
    A2(){
        System.out.println("DC");
    }

    {
        System.out.println("IIB1");
    }

    {
        System.out.println("IIB2");
    }

    {
        System.out.println("IIB3");
    }

    static {
        System.out.println("static");
    }
}