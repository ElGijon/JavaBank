import java.util.Scanner;
import java.util.Random;

public class BankSystem {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        Account[] accounts = new Account[10];
        int numAccounts = 0;
        Random rand = new Random();

        while (true) {
          System.out.println(" ");
          System.out.println("#### Welcome to BankSystem! ####");
          System.out.println(" ");
          System.out.println("#### Please Select the Option ####");
          System.out.println("1. Create Account");
          System.out.println("2. Deposit");
          System.out.println("3. Withdraw");
          System.out.println("4. Check Balance");
          System.out.println("5. Quit");
          System.out.println(" ");
          System.out.print("Enter your choice: ");

          int choice = scan.nextInt();
          switch (choice) {
            case 1:
                int agencyNumber = rand.nextInt(10000) + 1000;
                int accountNumber = rand.nextInt(100000) + 10000;
                System.out.print("Please, Enter your full name: ");
                scan.nextLine();
                String name = scan.nextLine();
                accounts[numAccounts++] = new Account(agencyNumber, accountNumber, name);
                System.out.println(" ");
                System.out.println("Account created successfully!");
                System.out.println("Agency Number: " + agencyNumber);
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Account Holder: " + name);
                System.out.println(" ");
                break;

            case 2:
                System.out.print("Please, Enter your account number: ");
                accountNumber = scan.nextInt();
                Account account = findAccount(accountNumber, accounts, numAccounts);
                if (account == null) {
                System.out.println(" ");
                System.out.println("Sorry! Account not found!");
                break;
                }
                System.out.println(" ");
                System.out.print("Enter amount to deposit: ");
                int depositAmount = scan.nextInt();
                account.deposit(depositAmount);
                System.out.println(" ");
                System.out.println("Deposit successful!");
                break;

            case 3:
                System.out.println(" ");
                System.out.print("Enter account number: ");
                accountNumber = scan.nextInt();
                account = findAccount(accountNumber, accounts, numAccounts);
                if (account == null) {
                  System.out.println(" ");
                  System.out.println("Account not found!");
                  break;
                }
                System.out.println(" ");
                System.out.print("Enter amount to withdraw: ");
                int withdrawAmount = scan.nextInt();
                if (account.withdraw(withdrawAmount)) {
                  System.out.println(" ");
                  System.out.println("Withdraw successful!");
                } else {
                  System.out.println(" ");
                  System.out.println("Insufficient balance!");
                }
                break;

            case 4:
                System.out.println(" ");
                System.out.print("Enter account number: ");
                accountNumber = scan.nextInt();
                account = findAccount(accountNumber, accounts, numAccounts);
                if (account == null) {
                    System.out.println(" ");
                    System.out.println("Account not found!");
                    break;
                }
                System.out.println(" ");
                System.out.println("Current balance: " + account.getBalance());
                break;

            case 5:
                System.out.println(" ");
                System.out.println("Goodbye!");
                System.exit(0);
                break;
                default:
                System.out.println(" ");
                System.out.println("Invalid choice. Please try again.");
                break;
            }
        }
    }
    }


public static Account findAccount(int accountNumber, Account[] accounts, int numAccounts) {
    for (int i = 0; i < numAccounts; i++) {
      if (accounts[i].getAccountNumber() == accountNumber) {
        return accounts[i];
      }
    }
    return null;
  }
}

class Account {
  private int agencyNumber;
  private int accountNumber;
  private String name;
  private int balance;

  Account(int agencyNumber, int accountNumber, String name) {
    this.agencyNumber = agencyNumber;
    this.accountNumber = accountNumber;
    this.name = name;
    this.balance = 0;
  }

  int getAgencyNumber() {
    return agencyNumber;
  }

  int getAccountNumber() {
    return accountNumber;
  }

  String getName() {
    return name;
  }

  int getBalance() {
    return balance;
  }

  void deposit(int amount) {
    balance += amount;
  }

  boolean withdraw(int amount) {
    if (amount <= balance) {
      balance -= amount;
      return true;
    }
    return false;
  }
}

