package ex_25_OOPs_Abstraction_Interface;

public class Lab198_Interface {
    public static void main(String[] args) {
        Square s1 = new Square();
        Rectangle r1 = new Rectangle();
        s1.getAres(5,7);
        r1.getAres(2,9);

    }

}
interface Polygon{
    //incomplete function
    void getAres(int l, int b);
//    void complete(){
//
//    }  Can not create complete/concrete function until you use default

    default void getAreas1(){
        System.out.println("default concrete function is possible");
    }
    default void getAreas2(){
        System.out.println("Many Default functions can be possible");
    }
}

class Square implements Polygon{
    @Override
    public void getAres(int l, int b) {
        System.out.println("Area of Square is "+l*b);
    }
}

abstract class CC{
abstract void CC();
void CC1(){

}
}

class Rectangle implements Polygon{
    @Override
    public void getAres(int l, int b) {
        System.out.println("Area of Rect is "+l*b);
    }
}