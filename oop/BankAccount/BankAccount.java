public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numOfAccounts = 0;
    private static double totalBalance = 0;

    // ***constructors***
    public BankAccount() {
        setCheckingBalance(0);
        setSavingsBalance(0);
        this.numOfAccounts++;
        this.totalBalance += getCheckingBalance() + getSavingsBalance();
    }

    // ***methods***
    // deposit
    public void depositMoney(String account, double amount) {
        if(account == "Checking") {
            setCheckingBalance(getCheckingBalance() + amount);
            this.totalBalance += amount;
        } else if(account == "Savings") {
            setSavingsBalance(getSavingsBalance() + amount);
            this.totalBalance += amount;
        } else {
            System.out.println("Invalid account.");
        }
    }

    // withdrawl
    public void withdrawMoney(String account, double amount) {
        if(account == "Checking") {
            if(amount < checkingBalance) {
                setCheckingBalance(getCheckingBalance() - amount);
                this.totalBalance -= amount;
            } else {
                System.out.println("Insufficient funds.");
            }
        } else if(account == "Savings") {
            if(amount < savingsBalance) {
                setSavingsBalance(getSavingsBalance() - amount);
                this.totalBalance -= amount;
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Invalid account.");
        }
    }

    // display
    public double displayBalance(){
        return getCheckingBalance() + getSavingsBalance();
    }

    // ***getters & setters***
    // checking acct
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double amount) {
        this.checkingBalance = amount;
        totalBalance += amount;
    }

    // savings acct
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double amount) {
        this.savingsBalance = amount;
        totalBalance += amount;
    }


}