package ex_19_OOps_Inheritance;

public class testcase1 extends CommonToAll {
    public static void main(String[] args) {
runtc1();

    }
    static void runtc1() {
        testcase1 tc1 = new testcase1();
        System.out.println("runtc1");
        tc1.startbr();
        tc1.closebr();
        tc1.readexcel();
        tc1.readdatabase();

}
    }

