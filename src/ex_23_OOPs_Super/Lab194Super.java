package ex_23_OOPs_Super;

public class Lab194Super {
    public static void main(String[] args) {
    Animals a1 = new Animals();
    a1.Sound();
    }
}

class God{

    God(){
        System.out.println("D C for god which is a parent");
    }
    void Sound(){
        System.out.println("God method sound");
    }
    void message(){
        System.out.println("mesaage god");
    }
}

class Animals extends God{

    Animals(){
        super();
        System.out.println("DC for Animal which is child");
    }

    @Override
    void Sound() {
        super.Sound();
        System.out.println("This is weird animal Sound");
    }
}