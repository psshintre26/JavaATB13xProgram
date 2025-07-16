package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;

public class Lab243_AL {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList<>(10);
        a1.add("1");
        a1.add("4");

        a1.add("1"); // 0
        a1.add("2");  // 1
        a1.add("3"); // 2
        a1.add("3");  //3
        a1.add(4);  //4
        a1.add(true);  //5
        a1.add("3"); // 6
        a1.add("1111");
        a1.add("3");
        a1.add("3");
        a1.add("3");
        a1.add("3");


        System.out.println(a1.size());
        System.out.println(a1.isEmpty());
        System.out.println(a1.contains("1"));
        System.out.println(a1.contains(4));
        System.out.println(a1);

        System.out.println(a1.indexOf("3"));
        System.out.println(a1.lastIndexOf("3"));
        System.out.println(a1.toArray().length);

        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));

            a1.set(4,33);
            System.out.println(a1);
        }
        a1.clear();
        System.out.println(a1);


    }

}
