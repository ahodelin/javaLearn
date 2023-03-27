public class AccountMain{
    public static void main(String[] args){
        Account myAccount = new Account();
        myAccount.setAccountNumber(30);
        myAccount.setStand(6000.30);

        System.out.println(myAccount);
    }
}