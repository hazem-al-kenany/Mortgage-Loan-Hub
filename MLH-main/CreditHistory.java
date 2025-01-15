import java.util.Scanner;

public class CreditHistory {
    private int bankruptcies;
    private int collections;
    private int foreclosures;
    private int delinquencies;

    // Constructor to initialize CreditHistory objects
    public CreditHistory() {
        setAllCreditHistory();
    }

    public void setAllCreditHistory() {
        setBankruptcies();
        setCollections();
        setForeclosures();
        setDelinquencies();
    }
    
    public void showAllCreditHistory() {
        System.out.println("Credit History Information:");
        System.out.println("Bankruptcies: " + getBankruptcies());
        System.out.println("Collections: " + getCollections());
        System.out.println("Foreclosures: " + getForeclosures());
        System.out.println("Delinquencies: " + getDelinquencies());
    }
    
    //Methods to set credit history information
    public void setBankruptcies() {
        System.out.print("Enter number of bankruptcies: ");
        Scanner scanner = new Scanner(System.in);
        bankruptcies = scanner.nextInt();
    }

    public void setCollections() {
        System.out.print("Enter number of collections: ");
        Scanner scanner = new Scanner(System.in);
        collections = scanner.nextInt();
    }

    public void setForeclosures() {
        System.out.print("Enter number of foreclosures: ");
        Scanner scanner = new Scanner(System.in);
        foreclosures = scanner.nextInt();
    }

    public void setDelinquencies() {
        System.out.print("Enter number of delinquencies: ");
        Scanner scanner = new Scanner(System.in);
        delinquencies = scanner.nextInt();
    }
    
    // Methods to get and retrieve credit history information
    public int getBankruptcies() {
        return bankruptcies;
    }

    public int getCollections() {
        return collections;
    }

    public int getForeclosures() {
        return foreclosures;
    }

    public int getDelinquencies() {
        return delinquencies;
    }
}
