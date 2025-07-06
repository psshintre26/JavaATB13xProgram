package ex_18_OOPs_Constructor;

public class Lab176_DC {
    public static void main(String[] args) {
    car c1 = new car();
        System.out.println(c1.model);
    }

}
class car{
    String model;
    int year;

    car(){
        //Default constrictor
        model = "Maruti";
        year = 1998;
    }
}
