
public class ATM {
    private double balance;
    private double depositedAmount;
    private double withdrawedAmount;

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setDepositedBalance(double depositedAmount){
        this.depositedAmount = depositedAmount;
    }

    public double getDepositedBalance(){
        return depositedAmount;
    }

    public void setWithdrawedBalance(double withdrawedAmount){
        this.withdrawedAmount = withdrawedAmount;
    }

    public double getWithdrawedBalance(){
        return withdrawedAmount;
    }
}
