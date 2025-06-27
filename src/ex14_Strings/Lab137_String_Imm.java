package ex14_Strings;
//prove that Strings are immutable by nature
public class Lab137_String_Imm {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1= s1.concat(" World");
        System.out.println(s1);
    }
}
