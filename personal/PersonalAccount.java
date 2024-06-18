package personal;

public class PersonalAccount {

    private String accountNumber;
    private String holderName;
    protected Double accountBalance = 0.00;
    // This will give access to the attribute over a subclass,
    // but not in the main file

    public PersonalAccount() {
    }

    public PersonalAccount(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public PersonalAccount(String accountNumber, String holderName, Double initialDeposit) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.accountBalance = initialDeposit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void withdraw(Double amount) {
        if (accountBalance == null) {
            System.out.println("First, make a deposit to withdraw");
        } else if (accountBalance == 0.00) {
            System.out.println("You don't have enough money in your account");
        } else {
            accountBalance -= amount;
        }
    }

    public void deposit(Double amount) {
        if (accountBalance == null) {
            accountBalance = 0.00;
            accountBalance += amount;
        } else {
            accountBalance += amount;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account Number: " + accountNumber);
        sb.append("\nAccount holder name: " + holderName);
        sb.append("\nAccount balance: $ " + accountBalance);
        return sb.toString();
    }

}