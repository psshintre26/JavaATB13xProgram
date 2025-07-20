package ex_32_Collection_Framework_DSA.MAP;

import java.util.*;

public class TreeMap{
    public static void main(String[] args) {
        // Creating TreeMap
       Map values = new java.util.TreeMap<>();
        // Insert elements (note the order)
        values.put("Second", 2);
        values.put("First", 1);
        values.put("Third", 3);
        System.out.println("TreeMap (sorted by keys): " + values);

        // Replacing values
        values.replace("First", 11);
        values.replace("Second", 22);


        System.out.println("After replacement: " + values);

    }
}