package ex_18_OOPs_Constructor;

public class Lab174_Example2 {
    public static void main(String[] args) {
        webautomation w1 = new webautomation();
    }
}

class webautomation{
    webautomation(){
        //default constructor
        System.out.println("Read Data");
        System.out.println("Open the Page before loading the scripts");
        System.out.println("Y0u can do anything which you want to do, when Object is created.");
    }
}