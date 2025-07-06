package ex_18_OOPs_Constructor;

public class Lab177_PC {
    //parameterised
    public static void main(String[] args) {
    baby1 b1 = new baby1();
    baby1 b2 = new baby1("Mani",1234);
    }
}
class baby1{
    String name;
    int adhar;

    baby1(){
        name = "Gugu";
        adhar = 1234;
    }

    baby1(String name1,int adhar1){
        this.name = name1;
        this.adhar = adhar1;
    }
}