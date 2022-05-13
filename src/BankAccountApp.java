import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) throws Exception {
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        Scanner scanner = new Scanner(System.in);
        int bankMenuChoice;
        do
        {
          bankMenuChoice = bankMenu();
          if(bankMenuChoice == 2)
          {
              BankAccount account = createAccount();
              accounts.add(account);
              account.setAccountNumber(accounts.size());
              System.out.println("Account created .." + account);
          }
          else if(bankMenuChoice == 1)
          {
              int accountNumber = getAccount();
              for (BankAccount account: accounts) {
                  if(account.getAccountNumber() == accountNumber)
                  {
                      int accountMenuChoice;
                      do {
                          accountMenuChoice = mainMenu(account);
                          if(accountMenuChoice == 1) {
                              System.out.println(account.getAccountBalance());
                          } else if(accountMenuChoice == 2) {
                             System.out.println("How much money you want to withdraw?");
                             int amount = Integer.valueOf(scanner.nextLine());
                             account.withdraw(amount); 
                             System.out.println(account);
                          }  else if(accountMenuChoice == 3) {
                            System.out.println("How much money you want to deposit?");
                            int amount = Integer.valueOf(scanner.nextLine());
                            account.deposit(amount); 
                            System.out.println(account);
                          } else if(accountMenuChoice == 4) {
                            System.out.println("Please enter the account number to transfer to?");
                            int number = Integer.valueOf(scanner.nextLine());
                            System.out.println("Please enter the amount to transfer:");
                            int amount = Integer.valueOf(scanner.nextLine());
                            account.withdraw(amount);
                            accounts.get(number - 1).deposit(amount);
                          } 
                      } while(accountMenuChoice != 0);
                  }
              }
              System.out.println("Account not found!");
          }
        } while(bankMenuChoice != -1);
        scanner.close();
    }

    private static int getAccount() {
        System.out.println("Enter account number");
        Scanner scanner = new Scanner(System.in);
        return Integer.valueOf(scanner.nextLine());
    }

    private static BankAccount createAccount() {
        System.out.println("Lets make a new account");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name for the account");
        String name = scanner.nextLine();
        System.out.println("What is the starting balance for the account?");
        double balance = Double.valueOf(scanner.nextLine());
        return new BankAccount(name, balance);
    }

    public static int mainMenu(BankAccount account)    
    {
        System.out.println("----------------------------------------");
        System.out.println("Hello " + account.getName());
        System.out.println("Welcome to the Main Menu, what would you like to do today?");
        System.out.println("1. To Check Account Balance");
        System.out.println("2. To make a withdraw");
        System.out.println("3. To make a deposit");
        System.out.println("4. To make a transfer to another account");
        System.out.println("0. To Exit");
        Scanner scanner = new Scanner(System.in);
        return Integer.valueOf(scanner.nextLine());        
    }

    public static int bankMenu()
    {
        System.out.println("Hello World! Welcome to the bank of Matt!");
        System.out.println("Are you an existing customer? (-1 to exit)");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Scanner scanner = new Scanner(System.in);
        return Integer.valueOf(scanner.nextLine());
    }
}
