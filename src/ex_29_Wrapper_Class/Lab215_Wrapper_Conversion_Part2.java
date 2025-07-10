package ex_29_Wrapper_Class;

public class Lab215_Wrapper_Conversion_Part2 {
    public static void main(String[] args) {
        String num = "10";
        //string to wrapper
        Integer a = Integer.parseInt(num);
        Integer b = Integer.valueOf(num);

        //string to primitive
        int aa = Integer.parseInt(num);

        //wrapper to string
        System.out.println(a.toString());

        //primitive to string
        int age = 10;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());

    }
}
