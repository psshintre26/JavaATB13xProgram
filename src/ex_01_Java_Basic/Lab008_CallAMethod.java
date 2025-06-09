package ex_01_Java_Basic;

public class Lab008_CallAMethod {
    static void MyMethod(){
        System.out.println("This is my method written");

    }
// this is how we call it inside main
    public static void main(String[] args) {
        MyMethod();
        System.out.println("My method is ran");
    }
}
