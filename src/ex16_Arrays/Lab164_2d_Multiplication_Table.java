package ex16_Arrays;

public class Lab164_2d_Multiplication_Table {
    public static void main(String[] args) {
        int [][] MultiPlicationTable = new int[2][2];
        for (int i = 0; i < MultiPlicationTable.length; i++) {
            for (int j = 0; j < MultiPlicationTable.length; j++) {
                System.out.print(i*j);
            }
            System.out.println();

        }
        System.out.println("*********");
        int[][]Mutli2 = new int[3][5];
        int scol = Mutli2[0].length;
        for (int i = 0; i < Mutli2.length; i++) {
            for (int j = 0; j < scol; j++) {
                System.out.print(i*j);
            }
            System.out.println();
        }

        int[][] imymulti = {

                {3,4,5},
                {6,7,8},
                {3,5,7}

            };
    }
}
