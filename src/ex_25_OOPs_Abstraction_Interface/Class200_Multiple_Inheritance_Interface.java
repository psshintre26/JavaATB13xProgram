package ex_25_OOPs_Abstraction_Interface;

public class Class200_Multiple_Inheritance_Interface {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.moeny();
        //second moeny shon in dropdown referes to second money function overridden
        c1.money();
    }
}

interface Fat1{
void moeny();
}
interface Fat2{
    void money();
}
class Child implements Fat1,Fat2 {
    @Override
    public void money() {
        System.out.println("Child Moeny");
    }

    @Override
    public void moeny() {
        System.out.println("Child Own mon");
    }
}