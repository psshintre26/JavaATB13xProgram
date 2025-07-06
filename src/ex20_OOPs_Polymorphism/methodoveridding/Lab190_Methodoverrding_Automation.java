package ex20_OOPs_Polymorphism.methodoveridding;

public class Lab190_Methodoverrding_Automation {
    public static void main(String[] args) {
        common c1 = new common();
        c1.openbr();

        chrome ch1 = new chrome();
        ch1.openbr();
        common c2 = new chrome(); //dynamic dispatch
        c2.openbr();
        common c3 = new Firefox();// dynamic dispatch
        c3.openbr();
    }
}
class common{
    void openbr(){
        System.out.println("open br_common");
    }
}
class chrome extends common{
    void openbr(){
        System.out.println("open Chrome");

    }

}
class Firefox extends common{
    void openbr(){
        System.out.println("firefox");
    }
}