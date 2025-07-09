package ex_22_OOPs_accessModifer;

public class Lab192 {

}
class father{
    private int gold = 1000;
    public int bhk1 = 1;
    int car = 1;
}
class son extends father{
    void wecanuse(){
        //System.out.println(gold); cant be used since private
        System.out.println(car);
        System.out.println(bhk1);
    }
}