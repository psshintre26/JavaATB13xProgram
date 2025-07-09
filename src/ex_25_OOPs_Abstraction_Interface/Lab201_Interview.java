package ex_25_OOPs_Abstraction_Interface;

public class Lab201_Interview {

}

interface i1{}
interface i2{}
class A1{ }
class B{}
abstract class Pramod{
    void Pramod(){}
}
class Test1 extends A{}
//class Test1 extends A{},b{}
class Test2 implements i1,i2{
}
class A extends B implements i1,i2{}

//class b2 implements i2 extends Test2 - not possible first implement then extend not possbile
//i1 implements i2  not possbile
class B1 implements i1{}
interface I4{
    //void f1(){} not possible
    void f2();
    default void f3(){}
    default void f4(){}
    static void f5(){}
}