package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab246_LL_P2 {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList(); // // Arrays Format - Continuous

        List mylist2 = new LinkedList(); // Doubly Linked List.

        mylist2.add("Pramod");
        mylist2.add("Dutta");
        mylist2.add("Amit");
        mylist2.add("meenu");
        mylist2.add("ritwik");
        mylist2.add("ritwik");
        mylist2.add(null);
        System.out.println(mylist2);
        System.out.println(mylist0);
        System.out.println(mylist2.get(0));
    }
}