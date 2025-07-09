package AccessModifierPractice.Criminal;

import AccessModifierPractice.Police.Cop;

 public class subclass extends Cop {

public subclass(int buleet){


}

     public static void main(String[] args) {
         subclass s1 = new subclass(10);
         s1.gun =11;
         s1.canShoot();
         // s1.f1();  -default cant be used in diff folders
     }

}
