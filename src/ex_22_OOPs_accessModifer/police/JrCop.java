package ex_22_OOPs_accessModifer.police;

public class JrCop {
    public static void main(String[] args) {

        Cop c2 = new Cop(100);
        c2.gun = 2;
        c2.CanIshoot();
        c2.thisisdefault();
        //c2.idcard = "ddd"; - not allowd since idcard was made private
    }

}
