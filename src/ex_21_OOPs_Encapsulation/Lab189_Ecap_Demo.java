package ex_21_OOPs_Encapsulation;

public class Lab189_Ecap_Demo {
    public static void main(String[] args) {
        login l1 = new login("axis","masttucheesebadi");
        System.out.println(l1.password);

        goodlogin gl1 = new goodlogin("asd","asasdasdMMMMMMdas");
        String spass =gl1.getPass();
        System.out.println(spass);
        gl1.setPass("dshdsChangedbyAdmin",true);
        String spass1 =gl1.getPass();
        System.out.println(spass1);
        //System.out.println(gl1.pass); //not allowd since its private ,it wont be accacible outsie its class hence use get setters

    }
}
class login{
    public String username;
    public String password;

//    public login() {
//    }

    public login(String username, String password) { // parameterized constructor using generate
        this.username = username;
        this.password = password;
    }
//    login(String user,String pass){
//        this.username = user;
//        this.password = pass;

    }
    class goodlogin{
    private String user;
    private String pass;

        public goodlogin(String user, String pass) {
            this.user = user;
            this.pass = pass;

        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass, boolean IsAdmin) {
            if (IsAdmin){
                this.pass = pass;
            }else {
                System.out.println("Not allowd to change password");
            }

        }
    }