package ex_32_Collection_Framework_DSA.List;

import java.util.Iterator;
import java.util.Vector;

public class Lab247_Vector {
    public static void main(String[] args) {
        Vector v1 = new Vector<>();
        v1.add("Pramod");
        v1.add("Dutta");
        v1.add("Amit");
        v1.add("meenu");
        v1.add("ritwik");
        v1.add("ritwik");
        v1.add(null);
        System.out.println(v1);
        System.out.println("------");
        for (int i = 0; i < v1.size(); i++) {
            System.out.println(v1.get(i));
        }
        System.out.println(" ----  For  Each Loop ");

        for (Object o:v1){
            System.out.println(o);
        }

        System.out.println(" ----  Iterator ");

        Iterator i1 = v1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }


    }
}
