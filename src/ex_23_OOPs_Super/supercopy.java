package ex_23_OOPs_Super;

public class supercopy {
    public static void main(String[] args) {
        iAnimal cat = new iAnimal();
        cat.sound();
    }

}

class iGOD{
    public  int gold = 100;
    void sound(){
        System.out.println("GOD!!");
    }

    iGOD(){
        System.out.println("GOD DC");
    }
}

class iAnimal extends iGOD{
    @Override
    void sound() {
        System.out.println("animal sound");
        super.sound();
    }
    iAnimal(){
        this.sound();
        //super();
    }
    iAnimal(int a,int b){
        System.out.println(a+b);
    }
}
