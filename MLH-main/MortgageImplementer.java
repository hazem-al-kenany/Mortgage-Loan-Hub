
/**
 * Write a description of class MortgageImplementer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class MortgageImplementer implements MLH {
    
    private MortgageMarket mortgageMarket;
    
    public MortgageImplementer() {
        this.mortgageMarket = new MortgageMarket();
    }
    
    @Override
public MortgageMarket initializeMortgageMarket(int numOFBorrowers, int numOFProperties, int numOFLenders) {
    // Initialize MortgageMarket with a given number of borrowers, properties, and lenders
    // For simplicity, let's assume borrowers, properties, and lenders are already provided elsewhere
    MortgageMarket mortgageMarket = new MortgageMarket(); // Create a new MortgageMarket object
    
    // Add dummy borrowers, properties, and lenders
    for (int i = 0; i < numOFBorrowers; i++) {
        mortgageMarket.addBorrower(new Borrower("Borrower " + (i + 1), "123456789" + i, "1234567890" + i, "01/01/2000"));
    }
    for (int i = 0; i < numOFProperties; i++) {
        mortgageMarket.addProperty(new Property("Street Address " + (i + 1), 100000 + i, "Type of Home", 200, 1000, 50));
    }
    for (int i = 0; i < numOFLenders; i++) {
        mortgageMarket.addLender(new Lender("Lender " + (i + 1), "Lender Name " + (i + 1), 0.05, 0.3, 0.04, 0.01, 5000, 30));
    }
    
    return mortgageMarket;
}


    @Override
    public Application apply(Borrower b, Property p, Lender l) {
        // Create and return a new mortgage application
        Application application = new Application();
        return application;
    }

    @Override
    public ProcessedApplication process(Application a) {
        // Process the mortgage application to determine status and total price of transaction
        ProcessedApplication processedApplication = new ProcessedApplication();
        processedApplication.setApplicationNumber();
        processedApplication.setBorrower();
        processedApplication.setLender();
        processedApplication.setProperty();
        processedApplication.determineStatus();
        processedApplication.createLoanEstimate(a.getProperty().getExpectedSalesPrice());
        return processedApplication;
    }

    @Override
    public ClosedApplication close(ProcessedApplication pa) {
        // Closing process
        ClosedApplication closedApplication = new ClosedApplication();
        closedApplication.setApplicationNumber();
        closedApplication.setBorrower();
        closedApplication.setLender();
        closedApplication.setProperty();
        return closedApplication;
    }
}
