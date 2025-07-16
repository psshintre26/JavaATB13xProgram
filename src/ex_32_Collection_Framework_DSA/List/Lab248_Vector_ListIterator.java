package ex_32_Collection_Framework_DSA.List;

import java.util.ListIterator;
import java.util.Vector;
import java.util.Iterator;

public class Lab248_Vector_ListIterator {
    public static void main(String[] args) {
        Vector v1 = new Vector<>();
        v1.add("Item1");
        v1.add("Item2");
        v1.add("Item3");
        v1.add("Item4");
        v1.add("Item5");
        System.out.println(v1);

        ListIterator LI = v1.listIterator();
        while (LI.hasNext()){
            System.out.println(LI.next());
        }
        System.out.println("____");
        while ((LI.hasPrevious())){
            System.out.println(LI.previous());
        }
        System.out.println("____");
        Iterator ii= v1.iterator();
        while (ii.hasNext()){
            System.out.println(ii.next());
        }
    }
}
