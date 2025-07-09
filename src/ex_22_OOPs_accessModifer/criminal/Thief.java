package ex_22_OOPs_accessModifer.criminal;
import ex_22_OOPs_accessModifer.police.Cop;
public class Thief {
    public static void main(String[] args) {
    Cop c1 = new Cop(100);
    c1.gun = 100;
    // c1.thisisdefault; default cant be accessed in diff package
    // c1.CanIshoot(); // made that private or default and even protected
    }
}

