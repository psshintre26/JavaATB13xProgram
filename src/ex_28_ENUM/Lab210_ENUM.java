package ex_28_ENUM;

import javax.management.MBeanAttributeInfo;
import java.util.EnumMap;
//these are used for fixed set of values like DAYS, states,categories etc. instead of may be creating and storing them in arrays
public class Lab210_ENUM {
    public static void main(String[] args) {
        System.out.println(Day.FRI);
        System.out.println(Project.RESTASSURED);
    }
}
enum Day{
    SUN,MON,TUES,THRUS,FRI
}

enum Project{
    GOOGLE,EID,RESTASSURED
}