package ex09_Switch;

public class Lab093_JDK13Above_SingleLiners {
    public static void main(String[] args) {
        int itemcode = 12;
        switch (itemcode){
            case 1 -> System.out.println("item code is " +itemcode);
            case 2 -> System.out.println(2);
            case 12 -> System.out.println(12);
        }
    }
}
