package ex_18_OOPs_Constructor;

public class Lab178_PC_Real {
    public static void main(String[] args) {
        person p1 =new person();
        person p2 = new person("pals",123);
        p1.name = "pals1";
        System.out.println(p1.name);
    }
}

class person{
    String name;
    long adhar;
    person(){
        System.out.println("Default constr");
        System.out.println(name); //this will be null
    }
    person(String iname,int iadhar){
        System.out.println("parameterized constr");
        this.adhar = iadhar;
        this.name = iname;
        System.out.println(iadhar);
    }
}