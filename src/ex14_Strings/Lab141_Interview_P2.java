package ex14_Strings;

public class Lab141_Interview_P2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";
        String s10 = "Hello";
// ==  refer to location or reference
        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        System.out.println(s1==s3);
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1 ==s4);
        System.out.println(s1==s10);

        // = checks for same content
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));
    }
}
