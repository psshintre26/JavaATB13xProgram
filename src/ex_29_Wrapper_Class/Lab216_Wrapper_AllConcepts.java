package ex_29_Wrapper_Class;

public class Lab216_Wrapper_AllConcepts {
    public static void main(String[] args) {


        mobile iphone = new mobile(9543432, "Self");
        mobile android = new mobile(213123, "HIS");
        iphone.calling();
        iphone.display();
        android.setPhone(213123);
        iphone.pricechage(333);
        android.SwtichONAirplaneMode();
        System.out.println(Covers.red.getColor());
        System.out.println(Covers1.Apple.getFruitcode());
    }
    }


class mobile extends oldPhone{

    //private static variables
    private Integer phone;
    private String name;
    static String carrier;
    //constrctors default and para
    mobile(){
        System.out.println("D C");
    }
    mobile(int num, String name){
        System.out.println("P C ");
    }
    //normal function /method
    void display(){
        System.out.println(this.name+this.phone);
    }
    //static function
    static void SwtichONAirplaneMode(){
    }

    //getter setter
    public Integer getPhone() {
        return phone;
    }
    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //method overlaoding
    void pricechage(Integer a){}
    void pricechage(String name){}

    //method overriding

    @Override
    void calling() {
        System.out.println("Method override ");
    }
}

enum Covers{
    red("XYZ"),
    blue("ABC"),
    ;

    public String getColor() {
        return this.color;
    }

    private String color;
    Covers(String color){
        this.color = color;
    }


}

class oldPhone implements SIMCARD{
    @Override
    public void entercard() {
    }
    void calling(){
        System.out.println("Old ph calling");
    }
}

interface SIMCARD{
    void entercard();
}

enum Covers1{
    Apple("AP"),
    Pear("PP");

    private String fruitcode;
    Covers1(String fruitcode){
        this.fruitcode = fruitcode;
    }

    public String getFruitcode() {
        return fruitcode;
    }

}