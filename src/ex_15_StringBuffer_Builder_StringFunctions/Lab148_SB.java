package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab148_SB {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("JAVA");
        sbf.append(" Programming");
        System.out.println(sbf);
        sbf.delete(5,16);
        System.out.println(sbf);
        sbf.replace(0,4,"C++");
        System.out.println(sbf);
        sbf.append(" Programming ");
        System.out.println(sbf);
    }
}
