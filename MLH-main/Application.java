import java.util.List;
import java.util.Scanner;

public class Application {
    private String applicationNumber;
    private Borrower borrower;
    private Lender lender;
    private Property property;
    private double totalAssets;
    private double totalLiabilities;

    // Constructor to initialize Application objects
    public Application() {
        setApplicationNumber();
        setBorrower();
        setLender();
        setProperty();
        setTotalAssets();
    }

    // Getter methods to retrieve Application information
    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter application number: ");
        this.applicationNumber = scanner.nextLine();
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter borrower: ");
        String borrowerName = scanner.nextLine();
        // Assuming borrower object has setter method for name
        borrower.setBorrowerName(borrowerName);
    }

    public Lender getLender() {
        return lender;
    }

    public void setLender() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lender: ");
        String lenderName = scanner.nextLine();
        // Assuming lender object has setter method for name
        lender.setLenderName(lenderName);
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter property Number: ");
        String propertyNumber = scanner.nextLine();
        // Assuming property object has setter method for name
        property.setPropertyNumber(propertyNumber);
    }

    public double getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total assets: ");
        this.totalAssets = scanner.nextDouble();
    }

    public double getTotalLiabilities() {
        return totalLiabilities;
    }

    // Method to calculate total assets based on borrower's assets
    public double calculateTotalAssets(Assets assets) {
        double totalAssets = 0.0;
        List<BankAccount> bankAccounts = assets.getBankAccounts();
        for (BankAccount account : bankAccounts) {
            totalAssets += account.getCurrentBalance();
        }
                
        return totalAssets;
    }

    // Method to calculate total liabilities based on borrower's debts
    public double calculateTotalLiabilities(Debts debts) {
    double totalLiabilities = debts.calculateTotalDebt();
    return totalLiabilities;
}
}
