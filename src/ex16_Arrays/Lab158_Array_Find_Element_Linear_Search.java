package ex16_Arrays;

public class Lab158_Array_Find_Element_Linear_Search {
    public static void main(String[] args) {
        //Find the target 67, give index ?
        int[] num ={22,33,67,55,77};
        int itarget = 67;
        for (int i = 0; i < num.length; i++) {
            if (itarget == num[i]){
                System.out.println("Found the target: " +itarget+" With Index :"+i);
            }
        }

    }
}
