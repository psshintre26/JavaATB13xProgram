package ex08_IfElse;



public class scanner {


    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);

        if (age > 18) {
            System.out.println("allowd " + age);
        } else {
            System.out.println("not allowd " + age);
        }
        main1(args);
    }

    static void main1(String[] args) {
        int age1 = Integer.parseInt(args[2]);
        if (age1 == 48){
        System.out.println("go to goa..." );
        }


    }
}