package ex20_OOPs_Polymorphism.MethodOverloading;

public class WebAutomation {
    public static void main(String[] args) {
        browser b1 = new browser();
        b1.startbr();
        String bbr= b1.startbr("Chrome");
    }
}
class browser{

    void startbr(){
        System.out.println("Start void br");
    }
    String startbr(String sbrowser){
        System.out.println("start browser "+sbrowser);
        return sbrowser;

    }
}