package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab146_SB {
    public static void main(String[] args) {
            String sname = "Pallavi";

//        StringBuffer stringBuffer = new StringBuffer("Shreyas ");
//        stringBuffer = stringBuffer.append(" Shintre");
//        System.out.println(stringBuffer);

//        StringBuffer sbf = new StringBuffer("Hello");
//        sbf.append(" World");
//        System.out.println("StringBuffer: " + sbf);

//        StringBuilder sbl = new StringBuilder("Hello");
//        sbl.append(" World");
//        System.out.println("StringBuilder: " + sbl);

        StringBuilder sbl = new StringBuilder(" PALINDROME ");

        sbl.reverse();
        System.out.println(sbl);

    }
}
