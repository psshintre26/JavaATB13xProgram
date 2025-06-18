package ex09_Switch;

public class Lab094_JDK13_MultilinesClubCases {
    public static void main(String[] args) {
        int iage = 13;
        switch (iage){
            case 1,11,2:
                System.out.println(iage);
                System.out.println(iage);
                break;
            case 3,16,13:
                    System.out.println(iage+ "  is invalid");
                System.out.println(iage);
                    break;
        }
    }
}
