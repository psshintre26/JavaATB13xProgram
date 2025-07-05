package ex_17_OOPs;

public class Lab167_OOps_P2 {
    public static void main(String[] args) {
        student s1 = new student();
        System.out.println(s1.nam);
        s1.nam = "pallavi1";
        System.out.println(s1.nam);
        s1.study();

    }
}
    class student{
    String nam = "Pallavi";

    student(){
        System.out.println("Default constructor");
    }
    void study(){
        System.out.println("student stydy class student");
    }
    }

