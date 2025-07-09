package ex_23_OOPs_Super;

import java.io.FileInputStream;

public class MyUnderstandingOfSuper {
    public static void main(String[] args) {
        Second d = new Second();
        d.mazimethod();

        //Second e = new Second(22);
        //d.mazimethod();
    }

}

class First{
    First(){
        System.out.println("First DC");
    }
    First(int a){
        System.out.println("First PC");

    }

    void mazimethod(){
        System.out.println("First method");
    }
}
class Second extends First{
 private int testInt ;
    public int third;
//    public int getTestInt() {
//        return testInt;
//    }
//
//    public void setTestInt(int testInt) {
//        this.testInt = testInt;
//    }

    Second(){
        //super();
        System.out.println("Second DC");
    }

    Second(int a){
        super(22);
        System.out.println("Second pc");
    }

    @Override
    void mazimethod() {
        super.mazimethod();
        this.third = 33;
//        this.setTestInt(10);
        System.out.println(this.third);

        //this.mazimethod();
        System.out.println("mazi method Second");
    }

}