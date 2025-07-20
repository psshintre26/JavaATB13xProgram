package ex_32_Collection_Framework_DSA.MAP;
import java.util.HashMap;
import java.util.Map;
public class Lab261Map {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Name","palla");
        m1.put("rollno",1);
        m1.put(123,"NULL");
        m1.put("phone",987654321);
        System.out.println(m1);

        Map m2 = new HashMap<>();
        m2.put("Name","palla1");
        m2.put("rollno",31);
        m2.put("phone",887654321);
        System.out.println(m2);
        System.out.println(m2.size());
    }
}
