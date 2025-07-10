package ex_30_Exceptions;

public class Lab217_ExceptionsExplained {
    public static void main(String[] args) {
        System.out.println("Start the program");
        String input = args[0];
        Integer a = Integer.parseInt(input);
        Integer output = 100/a;
        System.out.println(output);
        System.out.println("end");

        //prob is a can be user input , if its 0 or null or string then we will get run time error
        //so we need exception handling
        //this is unchecked exception since we will get error only while running and not while comiling
    }
}
