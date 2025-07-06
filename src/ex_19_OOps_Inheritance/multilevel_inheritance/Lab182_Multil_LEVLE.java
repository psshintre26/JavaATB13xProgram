package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab182_Multil_LEVLE {
    public static void main(String[] args) {
        Grandfather gf1 =new Grandfather();
        gf1.home();
        gf1.gf();

        Father f1 = new Father();
        f1.f();
        f1.home();
        f1.gf();f1.home();f1.gf();

        Son s1 = new Son();
        s1.gf();s1.f();s1.s();
    }
}
