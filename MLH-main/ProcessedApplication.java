    // create a constructor to initialize ProcessedApplication's objects.
    // and a list of methods to get and retrieve ProcessedApplication' information.
    // Including all information about Application,
    // ProcessedApplication usually have the following type of information
    /*
    * Status (Approved or rejected)
    * LoanEstimate

  // Define a method to determine status based on the following:
 //   if total debts >= total assets
 //   or total debts/total income > Debt-to-income (DTI) ratio (of the lender)
 //   or if there is any outstanding judgments against borrower
    //or borrower has been declared bankrupt within the past 7 years.
    //or borrower had property foreclosed upon or given title or deed in lieu thereof in the last 7 years
    //or borrower is a party to a lawsuit
    //or borrower has  directly or indirectly been obligated on any loan which resulted in foreclosure, transfer of title in lieu of foreclosure, or judgment.


    // Define a method to create the LoanEstimate (if status is approved) based on
    // the information of property's price, lender fees, interest rate
    // otherwise (status is rejected) LoanEstimate attributes will be -1 (a number to declare rejection status)
*/
    
public class ProcessedApplication extends Application {

    public String status;
    public LoanEstimate loanEstimate;

    public ProcessedApplication() {
        super();
    }

    public String getStatus() {
        return status;
    }

    public LoanEstimate getLoanEstimate() {
        return loanEstimate;
    }

    public void determineStatus() {
        double totalDebts = getTotalLiabilities(); // Make sure getTotalLiabilities() is public
        double totalAssets = calculateTotalAssets(getBorrower().getAssets()); // Make sure calculateTotalAssets() is public
        double debtToIncomeRatio = getLender().getDebtToIncomeRatio();

        if (totalDebts >= totalAssets || (totalDebts / getBorrower().getIncomeFloat()) > debtToIncomeRatio) { // Access income amount
            status = "Rejected";
        } else {
            status = "Approved";
        }
    }

    public void createLoanEstimate(double propertyPrice) {
        if (status.equals("Approved")) {
            double interestRate = getLender().getInterestRate();
            double lenderFees = getLender().getLenderFees();
            double loanAmount = propertyPrice - getBorrower().getAssets().getProceeds(); // Access down payment from assets
            loanEstimate = new LoanEstimate(getBorrower().getBorrowerName(), loanAmount, getLender().getLoanTerm(), interestRate); // Use getBorrowerName() instead of getName()
        } else {
            loanEstimate = new LoanEstimate(getBorrower().getBorrowerName(), -1, -1, -1); //-1 attribute for rejection
        }
    }
}

