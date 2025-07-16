package ex_32_Collection_Framework_DSA.List;


import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class LabStack {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.add("java");
        s1.add("pyton");
        s1.add("c");
        s1.push("87asaskdh");
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1);

        Iterator i1 = s1.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());

        }
        System.out.println("****");
        ListIterator ls1 = s1.listIterator();
        while (ls1.hasNext()){
            System.out.println(ls1.next());
        }
        System.out.println("****");
    }
}
