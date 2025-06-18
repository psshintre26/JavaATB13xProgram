package ex_10_For_Loop;

public class Lab112_For_loop_Continue {
    public static void main(String[] args) {
        for (int i =0 ;i <51; i++){
            if (i == 5){
                System.out.println(i);
                continue;

            } //if
            else{
                System.out.println(" -> "+i);
            }
        } //for
    } //main
} //class
