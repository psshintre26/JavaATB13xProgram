package ex_21_OOPs_Encapsulation;

public class Lab190_RealBank {
    public static void main(String[] args) {
        ICICI i1= new ICICI("Pradip",20000);
        System.out.println(i1.getBalance());
        i1.setBalance(30000,true);
        int bal1 = i1.getBalance();
        System.out.println(bal1);
    }
}
class ICICI{
    String name;
    private int balance;

//    ICICI(){
//        System.out.println("default Con");
//
//
//    }



    ICICI(String sname, int ibalance){
        this.name = sname;
        this.balance = ibalance;

    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance, boolean Iscashier) {
            if (Iscashier){

            this.balance = balance;

            }else {
                System.out.println("not allowd only cashiers");
            }

    }

}
