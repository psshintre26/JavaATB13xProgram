package ex_30_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab232_Throws {
    public static void main(String[] args) {

    }
static void t(){
        try {
            FileInputStream f = new FileInputStream("dsfsdf");
        }catch (FileNotFoundException e){
            System.out.println("FILE not found");
        }
}


//use throws - here not using block, We have secured full function using throws
    //try catch is added to the block of code
void Usethrow() throws FileNotFoundException{
        FileInputStream f1 = new FileInputStream("sdf");
}
}

