import java.util.*;
/**
 * Write a description of class TestMortgage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestMortgage
{  
    public void projectTest() {
        // Initializing one borrower, two lenders, and one property
        Borrower borrower1 = new Borrower("Richard Watson", "123456789", "0121234567", "02/01/1989");
        Lender lender1 = new Lender("0123456789", "SLMF", 43.0, 500000.0, 10.0, 1300.0, 15000.0, 15);
        Lender lender2 = new Lender("2312345678", "AASMF", 35.0, 250000.0, 15.0, 1200.0, 12500.0, 10);
        Property property1 = new Property("104 VonRurden Island", 1000000.0, "Duplex Apartment", 2000.0, 24700.0, 1000.0);
        
        //Initializing MortgageMarket with the objects created
        MortgageImplementer MI = new MortgageImplementer();
        MI.initializeMortgageMarket(1, 2, 1);
        
        // Applying for property through both lenders for same borrower
        Application application1 = new Application();
        Application application2 = new Application();
        application1 = MI.apply(borrower1, property1, lender1);
        application2 = MI.apply(borrower1, property1, lender2);
        
        // Processing both applications to get loan amount
        ProcessedApplication processedapplication1 = new ProcessedApplication();
        ProcessedApplication processedapplication2 = new ProcessedApplication();
        processedapplication1 = MI.process(application1);
        processedapplication2 = MI.process(application2);
        
        // Comparing loan amounts to close the application with the lower loan amount
        ClosedApplication finalClosedApplication = new ClosedApplication();
        if (processedapplication1.loanEstimate.loanAmount > processedapplication2.loanEstimate.loanAmount){
            finalClosedApplication = MI.close(processedapplication2);
        } else{
            finalClosedApplication = MI.close(processedapplication1);
        }
    }
    
    public static void main(String[] args) {
        TestMortgage tester = new TestMortgage();
        tester.projectTest();
    }
}
