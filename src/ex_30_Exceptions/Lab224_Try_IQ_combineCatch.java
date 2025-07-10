package ex_30_Exceptions;

public class Lab224_Try_IQ_combineCatch {
    public static void main(String[] args) {
        try{
            int a = 10/0;
            String s1 = "NULL";
            s1.trim();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException exception ){
            System.out.println("STOP");
        }

    }
}

//checked go together with checked and unchecked go together with unchecked.while combining multiple catches
//unchecked list
//ArithmeticException
//NullPointerException
//ArrayIndexOutOfBoundsException
//StringIndexOutOfBoundsException
//NumberFormatException
//ClassCastException
//IllegalArgumentException
//IllegalStateException
//UnsupportedOperationException
//NegativeArraySizeException

//checked list
//IOException
// SQLException
//ClassNotFoundException
//InterruptedException
//ParseException
//InstantiationException
//NoSuchMethodException
//   CloneNotSupportedException
