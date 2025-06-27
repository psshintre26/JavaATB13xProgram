package ex14_Strings;
//create string direct assign and new
//1.string constant pool
//2. heap object area
public class Lab136_String_Creation {
    public static void main(String[] args) {
        String s1 = "PALLaa";
        String s2 = new String("Pall");
        System.out.println(s1);
        s1= "Dueeew";
        System.out.println(s2);
        System.out.println(s1);

        String s3 = "pallavi"; // pallavi memory is created in string constat pool in jvm
        // it cant be changed or destryoed until JVM exists
        s3 = "Lucky"; // Lucky is also created in SCPool
        //if you assign pallavi to lucky again
        //s3 = "pallavi" then no new memory is crated it will just point to the prev memory of pallavi created in String Constant pool in JVM
        //once string is created always stay there
        //thats why strings are immutable = they cant be changed

        //*******
        //usage of immutable
        //memory management -If we create 5 dtings thSystem.out.println(s1);en they can be just pointed to instead of creating new memory each time
        //*******

        //but when you type new , data will be created in object area

        String s4 = new String("Mast"); //data/memory created on object area

    }
}
