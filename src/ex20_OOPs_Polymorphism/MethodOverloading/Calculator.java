package ex20_OOPs_Polymorphism.MethodOverloading;

public class Calculator {
    public static void main(String[] args) {
        calc c1 = new calc();
        int iadd= c1.add(4,5);
        double dadd = c1.add(4.5,6.8,7.9);
        System.out.println(iadd);
        System.out.println(dadd);
    }
}

class calc{
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b, double c){
        return a+b+c;
    }

}
