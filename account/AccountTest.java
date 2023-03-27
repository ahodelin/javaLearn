public class AccountTest{
    public static void main(String[] args){
        Account a1 = new Account();
        Account a2 = new Account(4711);
        Account a3 = new Account(1234, 1000.);
        Account a4 = new Account(a3);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        System.out.println(new Account(5678, 2000.));
    }
}