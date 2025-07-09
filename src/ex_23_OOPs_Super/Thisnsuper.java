package ex_23_OOPs_Super;

public class Thisnsuper {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
        Car c2 = new Car(221);
        c2.display();
    }
}
class vehicle{
    //dc
    vehicle(){
        System.out.println("default const vehicle");
    }

    int vehicle(int a){
        System.out.println("para const vehicle");
        return a;
    }

    void message(){
        System.out.println("message function vehicle");
    }


    void display(){
        System.out.println("vehicle display");
    }

}

class Car extends vehicle{
private int maxspee = 122;
    public int getMaxspee() {
        return maxspee;
    }
    public void setMaxspee(int maxspee) {
        this.maxspee = maxspee;
    }

    Car(){
        super();
        System.out.println("dc for Car");
    }

    Car(int spee){
        super();
        System.out.println(spee);
    }

    @Override
    void display() {
        super.display();
        System.out.println("overrided display in car");
    }
}