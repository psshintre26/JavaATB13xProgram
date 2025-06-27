package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        pal();
        returnpal2();
        returnpal3();

    }
    static void pal(){
        System.out.println("This is a plain function with no return value Pal");
    }

    static int returnpal2(){
        System.out.println("this is a with return function");
        return 22;


    }
    static boolean returnpal3(){

    return true;
        //System.out.println(returnpal3());
    }
}
