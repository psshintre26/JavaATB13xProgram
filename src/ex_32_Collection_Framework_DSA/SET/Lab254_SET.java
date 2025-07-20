package ex_32_Collection_Framework_DSA.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab254_SET {
    public static void main(String[] args) {
        Set hs = new HashSet();

        Set lhs = new LinkedHashSet();

        Set ts = new TreeSet();

        hs.add("pall");hs.add("pall");hs.add("pall1");hs.add("pall2");hs.add("dsf");
        lhs.add("P");lhs.add("P");lhs.add("P1");lhs.add("P2");lhs.add("NULL");
        ts.add("qwPSS");ts.add("PSsadS");ts.add("PSS1");ts.add("PSS2");

        System.out.println(hs);System.out.println(lhs);
        System.out.println(lhs.size());
        System.out.println(ts);
    }
}
