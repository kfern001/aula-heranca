package program;

import business.BusinessAccount;
import java.util.Scanner;

public class Workspace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pass the account information: ");

        System.out.print("Account number: ");
        String accountNumber = sc.next();
        System.out.print("Account holder name: ");
        sc.nextLine();
        String holderName = sc.nextLine();
        System.out.print("What is the loan limit for the account? ");
        Double loanLimit = sc.nextDouble();

        BusinessAccount ba = new BusinessAccount(accountNumber, holderName, loanLimit);

        System.out.print("Does the client want to make an initial deposit? (s/n) ");
        char resposta = sc.next().charAt(0);

        if (resposta == 's') {
            Double accountBalance = sc.nextDouble();
            ba.deposit(accountBalance);
        }

        System.out.println("\nAccount successfully created. Account data: \n\n" + ba.toString());

        System.out.print("\n\nHello, do you want to make a deposit? (s/n) ");

        resposta = sc.next().charAt(0);

        if (resposta == 's') {
            System.out.print("What is the value you want to deposit? ");
            Double accountBalance = sc.nextDouble();
            ba.deposit(accountBalance);
            System.out.println("\nDeposit successfully done! Account data: \n\n" + ba.toString());
        }

        sc.close();
    }
}
