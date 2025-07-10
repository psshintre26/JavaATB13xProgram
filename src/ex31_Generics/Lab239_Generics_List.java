package ex31_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab239_Generics_List {
    public static void main(String[] args) {
        List normalList = new ArrayList();
        normalList.add(10);
        normalList.add("Pramod");
        normalList.add(true);

        List <Integer> IntegerList = new ArrayList();
        IntegerList.add(10);
        //IntegerList.add("St"); - Now we cant add String since its explicitely mentioned as Integer
    }
}
