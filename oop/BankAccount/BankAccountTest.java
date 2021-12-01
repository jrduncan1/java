public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount();

        acct1.depositMoney("Checking", 10000.51);
        acct1.withdrawMoney("Checking", 500.47);
        System.out.println("Checking balance = $" + acct1.getCheckingBalance());

        acct1.depositMoney("Savings", 10000.51);
        acct1.withdrawMoney("Savings", 500000);
        System.out.println("Savings balance = $" + acct1.getSavingsBalance());

        System.out.println("Total balance = $" + acct1.displayBalance());

    }
}