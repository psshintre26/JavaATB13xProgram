package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab195_Abstraction {
    public static void main(String[] args) {
        CarVan c1 = new CarVan();
        //Fat f1 = new Fat();
        Child ch1 = new Child();
        Fat f1 = new Child();
        f1.loa20k();
        f1.loan50k();

        }
    }


class CarVan{
    void donemethod(){


    }
}

abstract class Fat{

    abstract void loan50k();

void loa20k(){
    System.out.println("Fat replayed 20k");
    }
}

class Child extends Fat{
    void loan50k(){
        System.out.println("child has to replay 50k");
    }
}