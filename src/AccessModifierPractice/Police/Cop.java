package AccessModifierPractice.Police;

public class Cop {
    //public static void main(String[] args) {
        public Integer gun;
        public String idcard;


    //}
    public Cop(int bullets){
    this.gun = 2;
    }

    public Cop() {
    }

    protected void canShoot(){
        System.out.println("Cop shoots");
    }

    void f1(){
        System.out.println("default");
    }

}
