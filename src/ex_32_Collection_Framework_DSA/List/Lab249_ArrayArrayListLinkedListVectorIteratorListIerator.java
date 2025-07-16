package ex_32_Collection_Framework_DSA.List;

import java.util.*;

public class Lab249_ArrayArrayListLinkedListVectorIteratorListIerator {
    public static void main(String[] args) {

        int []arr2= {2,3,4,5};System.out.println(arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);}

        String [] arr3 = {"asd","asdd","ert"};
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);}

        Integer[] arr = {1, 2, 3, 4};
        Integer[] arr1 = new Integer[4];

        //arraylist
        List l2 = new ArrayList<Integer>();
        l2.add(22);l2.add(44);l2.add(66);
        System.out.println(l2);
        List l1 = new ArrayList<>(10);
        l1.add(1);
        l1.add("sur");
        l1.add(22.33);
        l1.add(111);
        l1.add("asd");
        l1.add("asd");
        l1.add("asd1");

        System.out.println(l1);
        l1.set(1,33);
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.contains(1));
        System.out.println(l1.isEmpty());

        System.out.println("-----");
        for (int i = 0; i < l1.size(); i++) {
            //System.out.println(l1.get(i));

        }   //System.out.println("-----");
        for(Object o:l1){
            //System.out.println(o);
        }
      //System.out.println("******-----");
        for(Object O:l1){
            //System.out.println(O);
        }

l1.clear();
        System.out.println(l1);


        //linkedlist
        List l4= new LinkedList();
        l4.add(213);
        l4.add(213);
        l4.add("dsf");
        l4.add("123123");
        System.out.println("LinkedList: "+l4);
        System.out.println(l4.get(2));
        //Collections.sort(l4);
        //System.out.println(l4.getFirst("213"));

        List fruits = new Vector();
        fruits.add("pear");
        fruits.add("bana");
        fruits.add("grape");
        System.out.println(fruits);
        Iterator iterator = fruits.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Collections.sort(fruits); System.out.println(fruits);
        Collections.sort(fruits,Collections.reverseOrder());
        System.out.println(fruits);
    }

}