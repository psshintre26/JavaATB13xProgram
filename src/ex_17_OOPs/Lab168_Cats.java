package ex_17_OOPs;

public class Lab168_Cats {
    public static void main(String[] args) {
        cat c1 = new cat();
        cat c2;
        new cat();
        cat c3 = new cat();
        c1.name = "Mani1";
        System.out.println(c1.name);
        c1.run();
        c3.name = "Mani2";
        System.out.println(c3.name);
    }
}

class cat{
    String name = "mani";

    void run(){
        System.out.println("running cat");
    }
    cat(){
        System.out.println("Default constructor cat");
    }
}