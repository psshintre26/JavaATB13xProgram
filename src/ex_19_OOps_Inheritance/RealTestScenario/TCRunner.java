package ex_19_OOps_Inheritance.RealTestScenario;

public class TCRunner {
    public static void main(String[] args) {
        Testcase1 tc1 = new Testcase1();
        tc1.runtc1();
        Testcase2 tc2 = new Testcase2();
        tc2.runtc2();

        //dynamic dispatch - father ref can be present with the object of son
        ComonLib c1 = new ComonLib();
        ComonLib c2 = new Testcase1();
    }
}
