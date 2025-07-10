package ex31_Generics;

public class Lab236_Generics {
    public static void main(String[] args) {
        tempsum(4,5);
        tempsum("ww","rr");
        tempsum(5.5,7.8);
    }
static int tempsum(int a, int b){
    int itemp = a+b;
    return itemp;
}
static double tempsum(double a, double b){
    double itemp =a+b;
    return itemp;
}
static String tempsum(String a, String b){
    return a+b;
}
}
