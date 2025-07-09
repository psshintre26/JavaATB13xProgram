package ex_27_Static;

public class Lab206_StaticMethod {


        public static void main(String[] args) {
            // calling static method directly
            A21.greet();
            System.out.println(A21.b);
            A21 cc = new A21();
            cc.nonstaticMethod();
        }

}

class A21{
    Integer a = 10; // not static means instance variable
    static Integer b = 66;
    static void greet() {
        System.out.println("Hello from static method!");
        //this.a;
        System.out.println(b); // static methods only have static variables
        //System.out.println(a); static methods cant have instance(non static)variables
        //System.out.println(this.a);
    }
    A21(){
        System.out.println("DC");
    }
    void nonstaticMethod(){
        System.out.println(b);
        //Instance methods can have static variables
        System.out.println(a);
        System.out.println(this.a);
    }
}

