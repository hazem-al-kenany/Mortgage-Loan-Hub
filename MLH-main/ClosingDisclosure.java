    // create a constructor to initialize ClosingDisclosure's objects.
    // and a list of methods to get and retrieve ClosingDisclosure's information.
    // ClosingDisclosure usually have the following type of information

    /*
    * Loan_ID
    * Closing_Date
    * ClosingCosts (Average closing costs for the buyer run between about 2% and 6% of the loan amount. )
    * */

    // Define methods to calculate ClosingCosts based on the loan amount

    public class ClosingDisclosure {
    private String loanId;
    private String closingDate;
    private double closingCosts;

    public ClosingDisclosure(String loanId, String closingDate) {
        this.loanId = loanId;
        this.closingDate = closingDate;
        this.closingCosts = 0.0; // initially set to 0 (calculation method below)
    }

    public String getLoanId() {
        return loanId;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public double getClosingCosts() {
        return closingCosts;
    }

    // Method to calculate ClosingCosts based on the loan amount
    public void calculateClosingCosts(double loanAmount) {
        // Average closing costs for the buyer run between about 2% and 6% of the loan amount
        double averageClosingCostPercentage = 0.04; // Assuming an average of 4%
        closingCosts = loanAmount * averageClosingCostPercentage;
    }
}
