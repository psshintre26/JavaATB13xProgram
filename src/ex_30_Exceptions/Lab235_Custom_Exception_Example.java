package ex_30_Exceptions;

public class Lab235_Custom_Exception_Example {
    public static void main(String[] args) throws CurrencyMismatch {
        Bank ICICI = new Bank(40000, "RUP");
        Bank SBI =new Bank(50000,"RUP");
        Integer itotal = SBI.add(ICICI);
        System.out.println(itotal);

        Bank JPM = new Bank(120,"USD");
        int itotal_new =SBI.add(JPM);
        System.out.println(itotal_new);
    }
}
