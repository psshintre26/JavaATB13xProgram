package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;
//arraylist is v useful as compared to arrays but its single dimention only

public class Lab241_LIST_I {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList();
        List l = new ArrayList();
        arraylist.add("Palla");
        arraylist.add("Nul");

        arraylist.add("Du");
        arraylist.add("Du");
        arraylist.add(11);



        System.out.println(arraylist);
        System.out.println(arraylist.size());
        System.out.println(l);
        System.out.println(l.isEmpty());
        // ArrayList<Integer> al = new ArrayList<>(); data type specific
    }
}
