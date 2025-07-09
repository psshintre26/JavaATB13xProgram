package ex_26_IIB;

public class Lab203_IIB {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
    }
}
class A{
    A(){
        System.out.println("DC");
    }
    {
        System.out.println("Hi I am IIB - Instance Initialization Block");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file
    }

    {
        System.out.println("Multiple IIB2");
    }

    {
        System.out.println("multiple IIB3");

    }

    static {
        System.out.println("This is only one time loaded when firlst time the class is loaded");
    }
}