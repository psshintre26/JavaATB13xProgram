package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ_Factorial {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int ifact = scanner.nextInt();
//        long factorial = 1;
//        System.out.println("You have entered this number get its factorial: "+ifact);
//        //for (int i =1;i<ifact;)
//        for (int i = 1; i <= ifact ; i++) {
//            factorial = factorial * i;
//            System.out.println(factorial);
//        }//for
//        System.out.println("factorial is "+factorial);
Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of which factorial is needed");
long ifact = 1;
int inum = scanner.nextInt();
for (int i=1; i<=inum ;i++){
    ifact = ifact * i;
}
        System.out.println("factorial is "+ifact);
    }//main


}//class

