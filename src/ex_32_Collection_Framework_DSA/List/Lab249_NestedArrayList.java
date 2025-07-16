package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab249_NestedArrayList {
    public static void main(String[] args) {
        List<String>Fruits=new ArrayList<>();
        Fruits.add("Apple");
        Fruits.add("Banana");
        Fruits.add("Pear");
        Fruits.add("Grape");
        Fruits.add("chiku");

        List<String>Fruits1=new ArrayList<>();
        Fruits1.add("Cherry");
        Fruits1.add("papaya");
        Fruits1.add("guaua");
        Fruits1.add("mango");
        Fruits1.add("chiku");

        List Vegetables = new ArrayList<>();
        Vegetables.add("Tomato");
        Vegetables.add("onion");
        Vegetables.add("potato");
        Vegetables.add("brinjal");

        List LA = new ArrayList();
        LA.add(Fruits1);
        LA.add(Fruits);
        LA.add(Vegetables);
        System.out.println("Nested Arrays: "+LA);

    }
}
