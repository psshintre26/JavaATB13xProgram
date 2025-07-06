package ex_18_OOPs_Constructor;

public class Lab173_OOPs_Constructor {
    public static void main(String[] args) {


        baby b1 = new baby();
        b1.cry();
    }
}

class baby{

    String name;

    void cry(){
        System.out.println("cry");
    }

    void eat(){
        System.out.println("eat");
    }

    void sleep(){
        System.out.println("sleep");


    }
    baby(){

        // this is used to write pre coe
        //fetching sql
        //read data from data files
        System.out.println("Default constructor");
    }

}
