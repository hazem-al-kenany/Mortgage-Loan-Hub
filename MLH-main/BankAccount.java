import java.util.Arrays;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BankAccount {
    private String accountNumber;
    private String accountType;
    private boolean isOpen;
    private Date openDate;
    private Date closedDate;
    private String[] accountHolders;
    private double currentBalance;
    private double[] averageBalanceHistory;
    private double currentInterestRate;
    private double[] interestPaidHistory;
    private double balanceAtClose;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();

        System.out.println("Welcome to the Bank Account Management System!");
        System.out.println("1. Add a new account");
        System.out.println("2. View account data");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            bankAccount.addNewAccount();
        } else if (choice == 2) {
            bankAccount.printAccountData();
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public void addNewAccount() {
        AccountInfo();
        AccountStatus();
        BalanceInfo();
        Interest();
    }

    // Method to initialize account information
    public void AccountInfo() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
    
        System.out.print("Enter account type (Checking, Savings, MMA, CD): ");
        String accountType = scanner.nextLine();
    
        String[] validAccountTypes = {"Checking", "Savings", "MMA", "CD"};
        if (!Arrays.asList(validAccountTypes).contains(accountType)) {
            System.out.println("Invalid account type. Please choose one of the following options: Checking, Savings, MMA, or CD.");
            return;
        }

        System.out.print("Enter number of account holders: ");
        int numAccountHolders = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
    
        String[] accountHolders = new String[numAccountHolders];
        for (int i = 0; i < numAccountHolders; i++) {
            System.out.print("Enter name of account holder " + (i + 1) + ": ");
            accountHolders[i] = scanner.nextLine();
        }
    }

    // Method to initialize account status
    public void AccountStatus() {
        Scanner scanner = new Scanner(System.in);
    
        // Prompt for account status
        System.out.print("Is the account open? (true/false): ");
        boolean isOpen = scanner.nextBoolean();
        scanner.nextLine(); 
    
        // Prompt for open date
        Date openDate = null;
        System.out.print("Enter open date (YYYY-MM-DD): ");
        String openDateString = scanner.nextLine();
        try {
            openDate = new SimpleDateFormat("yyyy-MM-dd").parse(openDateString);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date in YYYY-MM-DD format.");
            return;
        }
    
        // Prompt for closed date if account is closed
        Date closedDate = null;
        if (!isOpen) {
            System.out.print("Enter closed date (YYYY-MM-DD): ");
            String closedDateString = scanner.nextLine();
            try {
                closedDate = new SimpleDateFormat("yyyy-MM-dd").parse(closedDateString);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter date in YYYY-MM-DD format.");
                return;
            }
        }
    }
    
    // Method to initialize balance information
    public void BalanceInfo() {
        Scanner scanner = new Scanner(System.in);
    
        // Prompt for current balance
        System.out.print("Enter current balance: ");
        double currentBalance = scanner.nextDouble();
    
        // Prompt for average balance history
        System.out.print("Enter number of months for average balance history: ");
        int numMonths = scanner.nextInt();
    
        double[] averageBalanceHistory = new double[numMonths];
        for (int i = 0; i < numMonths; i++) {
            System.out.print("Enter average balance for month " + (i + 1) + ": ");
            averageBalanceHistory[i] = scanner.nextDouble();
        }
    
        // Prompt for balance at close
        System.out.print("Enter balance at close: ");
        double balanceAtClose = scanner.nextDouble();
    }

    // Method to initialize interest information
    public void Interest() {
        Scanner scanner = new Scanner(System.in);
    
        // Prompt for current interest rate
        System.out.print("Enter current interest rate: ");
        double currentInterestRate = scanner.nextDouble();
    
        // Prompt for number of months for interest paid history
        System.out.print("Enter number of months for interest paid history: ");
        int numMonths = scanner.nextInt();
    
        double[] interestPaidHistory = new double[numMonths];
        for (int i = 0; i < numMonths; i++) {
            System.out.print("Enter interest paid for month " + (i + 1) + ": ");
            interestPaidHistory[i] = scanner.nextDouble();
        }
    }
    
    public void printAccountData() {
        System.out.println("\nAccount Information:");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Type: " + getAccountType());
        System.out.println("Is Open: " + isOpen());
        System.out.println("Open Date: " + getOpenDate());
        System.out.println("Closed Date: " + getClosedDate());
        System.out.println("Account Holders: " + Arrays.toString(getAccountHolders()));
        System.out.println("Current Balance: " + getCurrentBalance());
        System.out.println("Average Balance History: " + Arrays.toString(getAverageBalanceHistory()));
        System.out.println("Current Interest Rate: " + getCurrentInterestRate());
        System.out.println("Interest Paid History: " + Arrays.toString(getInterestPaidHistory()));
        System.out.println("Balance At Close: " + getBalanceAtClose());
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public String[] getAccountHolders() {
        return accountHolders;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double[] getAverageBalanceHistory() {
        return averageBalanceHistory;
    }

    public double getCurrentInterestRate() {
        return currentInterestRate;
    }

    public double[] getInterestPaidHistory() {
        return interestPaidHistory;
    }

    public double getBalanceAtClose() {
        return balanceAtClose;
    }
}
