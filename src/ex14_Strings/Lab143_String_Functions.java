package ex14_Strings;

import org.w3c.dom.ls.LSOutput;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.concat(" Goghale"));
        System.out.println(name.charAt(3));
        //******
        System.out.println("*********");
        System.out.println(name.equalsIgnoreCase("sonal"));
        System.out.println(name.contains("om")); System.out.println(name.contains("on"));
        System.out.println("*********");
        System.out.println(name.equals("sonal"));System.out.println(name.equals("Sonal"));


    }

}
