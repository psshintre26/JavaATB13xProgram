package ex_25_OOPs_Abstraction_Interface;

public class Lab202_Abstraction {

}
abstract class A11{
    int a = 10; //in abstract variable isnt final can be changed to diff value
    void test(){
        int a =33;
    }


    //can have a cons
    A11(){

    }
}
interface I11{
    int a = 10; // variable is automatically final and cant be reassigned

    // int a = 11;    - cant change the final value

    // I11{} - can not create a costr.
}