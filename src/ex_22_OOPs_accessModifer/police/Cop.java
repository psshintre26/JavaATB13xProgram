package ex_22_OOPs_accessModifer.police;

public class Cop {
    public int gun;
    private String idcard;

    public Cop(int bullet){
        this.gun = bullet;

    }
    //protected
    protected void CanIshoot(){
        System.out.println("you can !");
    }

    //default
    void thisisdefault(){
        System.out.println("hi cop!");
    }
}

