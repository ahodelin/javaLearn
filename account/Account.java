public class Account{
    private int accountNumber;
    private double stand;

    Account(){}

    Account(int accountNumber){
        this(accountNumber, 0.);
    }

    Account(int accountNumber, double stand){
        //this(accountNumber, stand);
        this.accountNumber = accountNumber;
        this.stand = stand;
    }

    Account(Account a){
        accountNumber = a.accountNumber;
        stand = a.stand;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(int nr){
        this.accountNumber = nr;
    }

    public double getStand(){
        return this.stand;
    }

    public void setStand(double amount){
        this.stand = amount;
    }

    public void insertMoney(double insM){
        this.stand += insM;
    }

    public void outMoney(double outM){
        this.stand -= outM;
    }

    public String toString(){
        return "Accountnumber: " + this.accountNumber + "\nStand: " + this.stand;
    }
}