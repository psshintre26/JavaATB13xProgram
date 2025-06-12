package ex_06_Ternary_Operator;

public class Maxbet3NumsInteviewQ {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = -9;
        int n3 = 8;
        int max =  (n1>n2) ? (n1>n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
        System.out.println(max);


    }
}
