package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab183_Multil_LEVLE {
    public static void main(String[] args) {
        Son amit = new Son();
//        Son s1 = new Grandfather(); not possible when gf is getting born son can not be present as a ref
//        Son s2 = new Father(); //same for father not possible
        Grandfather gf1 = new Son();
        //Grandfather gf2 = new Father();
        gf1.home();
//        Grandfather gf3 = new Father();
//        gf3.Home();
    }
}
