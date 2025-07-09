package ex_27_Static;

public class Lab209_Static_WebAutomation {
    public static void main(String[] args) {
Automatn t1 = new Automatn();
Automatn t2 = new Automatn();
Automatn t3 = new Automatn();


        System.out.println(Automatn.Driver);
        System.out.println(t2.Driver);
        System.out.println(t3.Driver);
        //System.out.println(this.Driver);
    }
}
class Automatn {
    static String Driver = "Chrome";

}
