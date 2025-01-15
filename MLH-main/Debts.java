import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Debts {
    private double currentMortgage;
    private double liens;
    private double alimony;
    private double childSupport;
    private double carLoans;
    private double creditCards;
    private double realEstateTaxes;
    private double homeownerAssnDues;
    private double hazardInsurance;
    private List<String> allDebts = new ArrayList<>();

    // Constructor to initialize Debts objects
    public Debts() {
        System.out.println("Current Mortgage: " + currentMortgage);
        System.out.println("Liens: " + liens);
        System.out.println("Alimony: " + alimony);
        System.out.println("Child Support: " + childSupport);
        System.out.println("Car Loans: " + carLoans);
        System.out.println("Credit Cards: " + creditCards);
        System.out.println("Real Estate Taxes: " + realEstateTaxes);
        System.out.println("Homeowner Association Dues: " + homeownerAssnDues);
        System.out.println("Hazard Insurance: " + hazardInsurance);
    }
    
    //Method to call all the debt setters
    public void setDebts() {
        setCurrentMortgage();
        setLiens();
        setAlimony();
        setChildSupport();
        setCarLoans();
        setCreditCards();
        setRealEstateTaxes();
        setHomeownerAssnDues();
        setHazardInsurance();
    }
    
    public void setAllDebts() {
        allDebts.clear(); // Clear the list to avoid duplicate entries
        
        if (currentMortgage != 0)
            allDebts.add("Current Mortgage");
        if (liens != 0)
            allDebts.add("Liens");
        if (alimony != 0)
            allDebts.add("Alimony");
        if (childSupport != 0)
            allDebts.add("Child Support");
        if (carLoans != 0)
            allDebts.add("Car Loans");
        if (creditCards != 0)
            allDebts.add("Credit Cards");
        if (realEstateTaxes != 0)
            allDebts.add("Real Estate Taxes");
        if (homeownerAssnDues != 0)
            allDebts.add("Homeowner Association Dues");
        if (hazardInsurance != 0)
            allDebts.add("Hazard Insurance");
    }
    
    public List<String> getDebtList() {
        return allDebts;
    }
    //Methods to set debts' information
      public void setCurrentMortgage() {
        System.out.print("Enter current mortgage: ");
        Scanner scanner = new Scanner(System.in);
        currentMortgage = scanner.nextDouble();
    }

    public void setLiens() {
        System.out.print("Enter liens: ");
        Scanner scanner = new Scanner(System.in);
        liens = scanner.nextDouble();
    }

    public void setAlimony() {
        System.out.print("Enter alimony: ");
        Scanner scanner = new Scanner(System.in);
        alimony = scanner.nextDouble();
    }

    public void setChildSupport() {
        System.out.print("Enter child support: ");
        Scanner scanner = new Scanner(System.in);
        childSupport = scanner.nextDouble();
    }

    public void setCarLoans() {
        System.out.print("Enter car loans: ");
        Scanner scanner = new Scanner(System.in);
        carLoans = scanner.nextDouble();
    }

    public void setCreditCards() {
        System.out.print("Enter credit cards: ");
        Scanner scanner = new Scanner(System.in);
        creditCards = scanner.nextDouble();
    }

    public void setRealEstateTaxes() {
        System.out.print("Enter real estate taxes: ");
        Scanner scanner = new Scanner(System.in);
        realEstateTaxes = scanner.nextDouble();
    }

    public void setHomeownerAssnDues() {
        System.out.print("Enter homeowner association dues: ");
        Scanner scanner = new Scanner(System.in);
        homeownerAssnDues = scanner.nextDouble();
    }

    public void setHazardInsurance() {
        System.out.print("Enter hazard insurance: ");
        Scanner scanner = new Scanner(System.in);
        hazardInsurance = scanner.nextDouble();
    }
    
    // Methods to get and retrieve debts' information
    public double getCurrentMortgage() {
        return currentMortgage;
    }

    public double getLiens() {
        return liens;
    }

    public double getAlimony() {
        return alimony;
    }

    public double getChildSupport() {
        return childSupport;
    }

    public double getCarLoans() {
        return carLoans;
    }

    public double getCreditCards() {
        return creditCards;
    }

    public double getRealEstateTaxes() {
        return realEstateTaxes;
    }

    public double getHomeownerAssnDues() {
        return homeownerAssnDues;
    }

    public double getHazardInsurance() {
        return hazardInsurance;
    }
    
    // Method to calculate the total debt
    public double calculateTotalDebt() {
        double totalDebt = currentMortgage + liens + alimony + childSupport + carLoans + creditCards
                + realEstateTaxes + homeownerAssnDues + hazardInsurance;
        return totalDebt;
    }
}

