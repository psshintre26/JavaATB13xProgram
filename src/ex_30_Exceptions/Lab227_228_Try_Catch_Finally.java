package ex_30_Exceptions;

public class Lab227_228_Try_Catch_Finally {
    public static void main(String[] args) {
        try {
            int a =10/0;
        }catch (ArithmeticException e){
            System.out.println("Caution !"+e.getMessage());
        }finally {
            System.out.println("I WILL BE ALWAYS EXCECUTED");
            //also used to close the scanner sc.close();  - - use of finally -
            // final is diff than finally - final means no change of value of variable
            //why to close scanner - garbage collector will close it after some time but its a bad practice,
            //like ur hand gets dirty you need to wash immediately without witing for mom :0 for example say
        }
    }
}
