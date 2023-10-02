import java.util.*;

public class MainATM {
    public static void main(String[] args) {
        AtmOperation ao = new AtmOperationImpl();

        Scanner scan = new Scanner(System.in);

        int atmNumber = 2022;
        int atmPin = 8275;

        System.out.println("\n\n\t\t !!! WELCOME TO ATM !!!");
        System.out.print("Enter Your ATM Number : ");
        int atmNum = scan.nextInt();
        System.out.println();
        System.out.print("Enter Your ATM Pin : ");
        int atmPi = scan.nextInt();
        System.out.println();

        if((atmNum == atmNumber) && (atmPi == atmPin)) {
            while(true){
                System.out.println("1. Check Your Balance");
                System.out.println("2. Withdraw Your Amount");
                System.out.println("3. Deposit Your Amount");
                System.out.println("4. Exit");
                System.out.println();

                System.out.println("Enter Your Choice : ");
                int ch = scan.nextInt();

                switch(ch){
                    case 1:
                        ao.checkBalance();
                        break;

                    case 2:
                        System.out.print("\nEnter Amount to be Withdrawn : ");
                        double withdrawedAmount = scan.nextDouble();
                        ao.withdrawAmount(withdrawedAmount);
                        System.out.println();
                        break;

                    case 3:
                        System.out.print("\nEnter Amount to be Deposited : ");
                        double depositedAmount = scan.nextDouble();
                        ao.depositeAmount(depositedAmount);
                        System.out.println();
                        break;

                    case 4:
                        System.out.println("\nCollect Your Card!!!   \n\t  !!!Thank You!!!  \n\t  Visit Again");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("\nPlease Enter a Valid Choice");
                        break;
                }
            }
        }
        if((atmNum != atmNumber) && (atmPi == atmPin)){
            System.out.println("Enter a Valid ATM Number");
        }
        if((atmPi != atmPin) && (atmNum == atmNumber)){
            System.out.println("Enter a Correct ATM Pin!!!");
        }
        else{
            System.out.println("Enter a Valid Information");
        }
    }
}


