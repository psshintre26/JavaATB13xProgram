package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab196_AB_Cars {

    public static void main(String[] args) {
        //Engines e1 = new Engines() {}  - swince its abstract cant create unless override abstract methods
        WagonR w1 = new WagonR();
        w1.driveWagonR();
        }
    }




abstract class Engines{
    abstract void StartEng();
    abstract void EndEng();
    void CheckEng(){
        System.out.println("Engine check");
    }
}

class WagonR extends Engines{
    @Override
    void StartEng() {
        System.out.println("Start Engine");
    }

    @Override
    void EndEng() {
        System.out.println("Stop Engine");
    }

    void driveWagonR(){
        StartEng();
        EndEng();
        CheckEng();
    }

}