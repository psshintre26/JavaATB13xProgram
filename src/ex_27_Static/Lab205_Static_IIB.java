package ex_27_Static;

public class Lab205_Static_IIB {
    public static void main(String[] args) {
        P p1 = new P();
        P p2 = new P();
        // static variable can be directly printed
        //p1.a;
        System.out.println(P.a);
        p1.a = 22;
        System.out.println(p1.a);
        System.out.println(P.a);
       // System.out.println(P.b); since its not declared as static cant be directly called by class
        System.out.println(p1.b);
        System.out.println(p2.b);
        p1.b = 45;
        p2.b=88;
        System.out.println(p1.b);
        System.out.println(p2.b);
    }
}

class P{
    static Integer a = 10;
    Integer b = 44;
}
//so static means common to all and it can get directly assigned to the class
