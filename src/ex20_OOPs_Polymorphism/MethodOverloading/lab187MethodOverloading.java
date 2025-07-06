package ex20_OOPs_Polymorphism.MethodOverloading;

public class lab187MethodOverloading {
    public static void main(String[] args) {
        Math m1 = new Math();
        int m = m1.add(2, 5);
        System.out.println(m);
        double dm = m1.add(2,4);
        System.out.println(dm);
        String sm =m1.add("Pallavi","Shintre");
        System.out.println(sm);
    }
}
    class Math {
        int add(int a, int b){
            return a+b;
    }

        int add(int a, int b, int c){
         return a+b+c;
        }
        double add(double a, double b){
            return a+b;
        }
        String add (String a, String b){
            return a+b;
        }
    }

