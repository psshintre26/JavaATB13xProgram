package ex_06_Ternary_Operator;

public class NestedTernary {
    public static void main(String[] args) {
        //age = 23; 18 <23<65 minor<adult< seniorcitizen
int age = 32;
String res = (age <18) ?  "Minor" :  (age < 65 )? "adult" :"Senior";

    }
}
