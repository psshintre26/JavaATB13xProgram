package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab197_Abstraction_REAL {
    public static void main(String[] args) {
        WagonR w1 = new WagonR();
        w1.driveWagonR();

        Company c1 = new Company();
        c1.CalculatePay(30000);

    }
}
abstract class Employee{
    private String name;
    private String address;
    private int number;
     //DC
    Employee(){
        System.out.println("DC");
    }
    Employee(String name,String address,int number){
        this.name = name;
        this.address = address;
        this.number = number;
    }
    abstract double CalculatePay(double a);
}
class Company extends Employee {

    double CalculatePay(double a) {
        System.out.println("Pay is "+a);
    return a;

    }
}