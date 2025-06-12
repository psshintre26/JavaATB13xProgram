package ex_02_Java_Basic;

public class CallingMethodsinSameClass {

        // Method definition performing a Call to another Method
        public static void main(String[] args) {
            Method1(); // Method being called.
            Method2(); // Method being called.
        }

        // Method definition to call in another Method
        public static void Method1() {
            System.out.println("Hello method1!");
        }

        // Method definition performing a Call to another Method
        public static void Method2() {
            System.out.println("Hello method2");


    }
}
