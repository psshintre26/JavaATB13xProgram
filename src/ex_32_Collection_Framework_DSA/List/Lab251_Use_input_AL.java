package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab251_Use_input_AL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String>Names = new ArrayList<>();
        ArrayList<Integer>Ages = new ArrayList<>();
        String continueInput = "Y";
        while (continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter Name: ");
            String sname = scanner.next();
            Names.add(sname);
            System.out.println("Enter Age: ");
            Integer iage = scanner.nextInt();
            Ages.add(iage);
            System.out.println("Do you have nore data? Y or N");
            continueInput=scanner.next();
        }
        for (Object O:Names){
            System.out.println(O);

        }
        for (Object O1:Ages){
            System.out.println(O1);
        }
    }
}
