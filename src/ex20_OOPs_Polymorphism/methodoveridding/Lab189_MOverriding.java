package ex20_OOPs_Polymorphism.methodoveridding;

public class Lab189_MOverriding {

    //method overriding is same method name in two diff classes, the object's been created that method will be called of not available then another method
    public static void main(String[] args) {
        animal a1 = new animal();
        a1.sound();
        dog a2 = new dog();
        a2.sound();
        int iS = a2.sound(10);
        System.out.println(iS);
    }
}

class animal{
    void sound(){
        System.out.println("default!");
    }


}
class dog extends animal{
void sound(){
    System.out.println("Bhu");
}
int sound(int a){ // this is method overload , same name methods in same class
        System.out.println("overloading");
    return a;
    }
}