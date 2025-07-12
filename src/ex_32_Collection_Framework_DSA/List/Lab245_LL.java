package ex_32_Collection_Framework_DSA.List;

import java.util.LinkedList;

public class Lab245_LL {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList();
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        animals.addLast("Elephant");
        System.out.println("LinkedList: " + animals);
animals.remove(1);
animals.removeFirst();
animals.removeLast();
        System.out.println(animals);
    }
}
