package ex_30_Exceptions;
//unchecked, cant trim a null - eoror while running
public class Lab219_String_NullPointer {
    public static void main(String[] args) {
        String name = null;
        name.trim();

    }
}
