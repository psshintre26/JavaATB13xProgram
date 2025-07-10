package ex_30_Exceptions;

public class Bank {

        private Integer money;
        private String currency;
    public Bank(Integer money, String name) {
        this.money = money;
        this.currency = name;
    }

    public String getName() {

        return currency;
    }

    public void setName(String name) {
        this.currency = name;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

void SetAmount(){

}
public Integer add(Bank bankname) throws CurrencyMismatch{
        if (bankname.currency.equals("INR")){
        return bankname.money+ this.money;
    }else{
    throw new CurrencyMismatch("Currency Mismtach");
    }

}

}
class CurrencyMismatch extends Exception{
    public CurrencyMismatch(String msg){
        super(msg);
    }
}
