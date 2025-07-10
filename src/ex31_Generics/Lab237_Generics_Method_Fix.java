package ex31_Generics;

public class Lab237_Generics_Method_Fix {

    public static void main(String[] args) {
        display(3.3,5.4);
        display(3.6,7);
        display(4,5);
        display("ee","rr");
    }
    static <T> void display( T a, T b){
        // static <G> void display( G a, G b){
        // static <PALLAVI> void display( PALLAVI a,  PALLAVI b){

//anything instead of T can be used really but good practice is T since its well known to otehr users as templat

    }

    static <T> T  DiplaywithRrturn( T a, T b){
        return null;
        //this will return - <T> T
        //this is void - <T>
    }
}
