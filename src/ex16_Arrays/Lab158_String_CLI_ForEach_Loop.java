package ex16_Arrays;

public class Lab158_String_CLI_ForEach_Loop {
    public static void main(String[] Pallavi) {
        for (int i = 0; i < Pallavi.length; i++) {
            System.out.println(Pallavi[i]);

        }
        System.out.println("----------");
        for (String arg:Pallavi){
            System.out.println(arg);
        }

    }
}
