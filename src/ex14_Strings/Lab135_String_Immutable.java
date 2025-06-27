package ex14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
String name = "Pall";
name.toUpperCase();

        System.out.println(name); //strings are immutable best exampple
        // so now name can be assigned to older one or new one so it proves memory is created in two places in JVM
        //whenever you do any operation with string it will create new memory/string


        System.out.println("Now assign and check");
        name= name.toUpperCase(); //reassign the value so PALL is created as a new string and we reassigned the value
        System.out.println(name);
    }
}
