package ex_13_Functions;

public class Lab132_UD_Part_1 {

    // Four types of user defined functions
    // 1. Without parameters without return type
     // 2. without parameters with return type
     // 3. with parameters without return tye
     // 4.With parameters with return tye

    public static void main(String[] args) {
        //1.
        System.out.println("****************");
        System.out.println("Without parameters without return type");
        np_nr_greet();


        //2
        System.out.println("****************");
        np_ret_greet();



        //3.

        System.out.println("****************");
        greet_with_details("Mani",22,22000);



        //4.

        System.out.println("****************");
        int sum = sumOfTwoNum(112,455);
        System.out.println("The addition of two numbers is : "+sum);

        //4 sub example
        int stotal = sum1(3,3,2);
        System.out.println("The sum of given three numbers Is :  "+stotal);
    }
    // 1. Without parameters without return type
    static void np_nr_greet(){
        System.out.println("Hello this is no para no ret function");
    }
    // 2. without parameters with return type
    static String np_ret_greet(){
        System.out.println(" -- Type 2 : Without Parameters but With Return Type -- ");
        System.out.println("wp_with_RT");
        return "Hi, are you?";
    }


    //3. w para w/o return
    static void greet_with_details(String name, int age, double salary){
        System.out.println("1. Name is: "+name+" 2. Age is: "+age+ " and 3.Salary is: "+salary);
        //System.out.println("name,age,salary);
    }

    //4. w para w return
    static int sumOfTwoNum(int i,int j){
        System.out.println("sum is");
        return i+j;



    }
    //sum of 3 numbers
    static int sum1(int i1, int j1, int z1){

        return i1+j1+z1;

    }

}
