package ex_19_OOps_Inheritance.SingleInheritanceDynamicDispatch;

public class Lab180_Inheritance {
    public static void main(String[] args) {

        father f1 = new father();
        System.out.println(f1.gold);
        f1.bhk2();

        //method();

        son s1 = new son();
        s1.bhk3();
        System.out.println(s1.gold);
        s1.bhk2();

    }
    }

