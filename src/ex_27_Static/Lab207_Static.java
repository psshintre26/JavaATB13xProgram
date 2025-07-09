package ex_27_Static;

public class Lab207_Static {
    public static void main(String[] args) {
        X.staticmethod();
        X xx = new X();
        xx.nonstaticMeth();
    }
    //All about static
}
class X{
    static{
        System.out.println("static block");
    }
    static Integer q = 99;
    Integer m = 88;

    static void staticmethod(){
         System.out.println(q);
        System.out.println(X.q);

        // NA - System.out.println(m);
    }
    void nonstaticMeth(){
        System.out.println(m);
        System.out.println(q);
    }
static class SC{

}
}
