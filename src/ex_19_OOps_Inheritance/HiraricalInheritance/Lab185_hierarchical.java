package ex_19_OOps_Inheritance.HiraricalInheritance;

public class Lab185_hierarchical {
    public static void main(String[] args) {
        father f1 = new son();
        f1.home();

        father f2 = new brother();
        f2.home();

        brother b1 = new sis();
        b1.home();
    }



}
class father{
void home(){
    System.out.println("F-home");
}
}
class son extends father{

}
class brother extends father{
void home(){
    System.out.println("bro home");
}
}
class sister extends father{

}


class sis extends brother{ // multiple inheritance

}