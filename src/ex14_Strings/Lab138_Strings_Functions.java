package ex14_Strings;

public class Lab138_Strings_Functions {
    public static void main(String[] args) {
        //char is diff and String is diff
        char c = 'a';
        System.out.println(c); //no functions assosiated with characters

        String s1 = "ABCD"; // now lot of functions avaialbe
        System.out.println(s1);
        System.out.println(s1.concat("E"));
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
    }
}
