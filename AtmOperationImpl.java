
public class AtmOperationImpl implements AtmOperation {
    
    ATM atm = new ATM();

    @Override
    public void checkBalance(){
        System.out.println("Available Balance : "+atm.getBalance());
        System.out.println();
    }

    @Override
    public void depositeAmount(double depositedAmount) {
        System.out.println(depositedAmount +" Amount Deposited");
        System.out.println();
        atm.setBalance(atm.getBalance() + depositedAmount);
        checkBalance();
    }

    @Override
    public void withdrawAmount(double withdrawedAmount) {
        if(withdrawedAmount <= atm.getBalance()){
            System.out.println(withdrawedAmount+" Amount Withdrawn");
            System.out.println("Collect Your Cash!!!");
            System.out.println();
            atm.setBalance(atm.getBalance() - withdrawedAmount);
            checkBalance();
        }
        else{
            System.out.println("Your Balance is Insufficient\n");
        }
    }
}
