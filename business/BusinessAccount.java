package business;

import personal.PersonalAccount;

public class BusinessAccount extends PersonalAccount {

    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(String accountNumber, String holderName, Double loanLimit) {
        super(accountNumber, holderName);
        this.loanLimit = loanLimit;
    }

    public BusinessAccount(String accountNumber, String holderName, Double accountBalance, Double loanLimit) {
        super(accountNumber, holderName, accountBalance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {
            deposit(amount);
        } else {
            System.out.println("You excceded your loan limit");
        }
    }

}
