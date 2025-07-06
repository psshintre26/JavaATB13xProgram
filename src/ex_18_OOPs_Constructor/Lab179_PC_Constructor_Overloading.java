package ex_18_OOPs_Constructor;

public class Lab179_PC_Constructor_Overloading {
    public static void main(String[] args) {
        Myperson p1= new Myperson();
        Myperson p2 = new Myperson(2344);
        Myperson p3 = new Myperson("Pal");
        Myperson p4 = new Myperson("pall",3222121);
    }
}
class Myperson{
String name;
long adhar;

Myperson(){
    System.out.println("default");


}
Myperson(String iname,long iadhar){
    System.out.println(iname);
    System.out.println(iadhar);
}

    Myperson (String sname){
        System.out.println(sname);
    }

    Myperson(long sadhar){
        System.out.println(sadhar);
    }
}