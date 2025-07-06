package ex20_OOPs_Polymorphism.MethodOverloading;

public class Lab188_REAL_MOverloading {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.task();
        int hi = h1.task(2);
        boolean hb = h1.task(true);

    }
}


class Home {

    void task() {

    }

    int task(int a) {
    return a;
    }

    boolean task(boolean a) {
    return a;
    }
}
