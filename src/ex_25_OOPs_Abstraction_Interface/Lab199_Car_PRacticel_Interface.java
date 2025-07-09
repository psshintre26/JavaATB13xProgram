package ex_25_OOPs_Abstraction_Interface;

public class Lab199_Car_PRacticel_Interface {
    public static void main(String[] args) {
        Car Tesla = new Car();
        Tesla.Drive();
    }
}

class Car implements Eng,Brakes{

    void Drive(){
        startEng();
        applyVBreak();
        EndEng();
    }
    @Override
    public void startEng() {
        System.out.println("Car Start eng");
    }

    @Override
    public void EndEng() {
        System.out.println("Car Stop eng");
    }

    @Override
    public void applyVBreak() {
        System.out.println("Car apply break");
    }
}



interface Brakes{
    void applyVBreak();
}

interface Eng{
    abstract void startEng();
    void EndEng();
    default void test(){
        System.out.println("Default Complete Function");
    }

}