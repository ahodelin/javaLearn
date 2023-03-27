public class ParameterTest{
    public void test(double amount, Account acc){
        amount += 100.;

        acc.insertMoney(amount);
    }

    public static void main(String[] args){
        ParameterTest p = new ParameterTest();

        double value = 1000.;
        Account account = new Account();

        System.out.println("Befor: value=" + value + " saldo=" + account.getStand());
        p.test(value, account);
        System.out.println("After: value=" + value + " saldo=" + account.getStand());
        System.out.println("Stand: " + account.getStand());
        System.out.println("New stand: value=" + value + " saldo=" + account.getStand());
    }
}