package CodingTest19June;

public class CodingChallenge4 {
    public static void main(String[] args) {
//        Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.
//
//                **Requirements:**
//        - Show the difference between ++i and i++
//                - Show the difference between --i and i--
//                - Print values before and after operations
        int i = 5;

        System.out.println("Initial value of i: " + i);

        // Post-increment
        System.out.println("Using i++ (post-increment): " + i++);
        System.out.println("Value of i after i++: " + i);

        // Reset i
        i = 5;

        // Pre-increment
        System.out.println("Using ++i (pre-increment): " + ++i);
        System.out.println("Value of i after ++i: " + i);
    }



    }