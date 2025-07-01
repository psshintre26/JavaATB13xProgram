package ex_13_Functions;

public class Lab133_InterviewQ {
    public static void main(String[] args) {

    }
    // this is called main method overloading (interviewers can ask if you can write many main methods
    //answer is Yes with diff return and data types but
    //only one main method recognized by JVM will be run.
    public static void main(String args) {
        System.out.println("Yes");
    }
    public static int main(int args) {
        return 10;
    }

    public static int main(float args) {
        return 10;
    }

    public static boolean main(boolean args) {
        return true;
    }

}
