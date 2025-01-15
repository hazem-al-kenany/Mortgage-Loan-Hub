public class LoanEstimate {
    // create a constructor to initialize LoanEstimate's objects.
    // and a list of methods to get and retrieve LoanEstimate's information.
    // LoanEstimate usually have the following type of information

    /*
    Applicant_Name (the Borrower's name)
    Loan_amount
    Loan_Term
    Interest_rate
    Monthly_Principal_AND_Interest
    Mortgage_Insurance
    Estimated_Escrow
    Estimated_Total_Monthly_Payment (Monthly_Principal_AND_Interest + Mortgage_Insurance + Estimated_Escrow)
    * */

    // Define a method that calculates the Estimated_Total_Monthly_Payment based on the information
    // of Loan_amount, Loan_Term, Interest_rate
    
    private String applicantName;
    public double loanAmount;
    private int loanTerm;
    private double interestRate;
    private double monthlyPrincipalAndInterest;
    private double mortgageInsurance;
    private double estimatedEscrow;
    private double estimatedTotalMonthlyPayment;
    
    public LoanEstimate(String applicantName, double loanAmount, int loanTerm, double interestRate) {
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
        this.loanTerm = loanTerm;
        this.interestRate = interestRate;
        this.monthlyPrincipalAndInterest = calculateMonthlyPrincipalAndInterest();
        this.mortgageInsurance = 0.0; // initially set to 0 (calculation method below)
        this.estimatedEscrow = 0.0; // initially set to 0 (calculation method below)
        this.estimatedTotalMonthlyPayment = calculateEstimatedTotalMonthlyPayment();
    }

    public String getApplicantName() {
        return applicantName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getMonthlyPrincipalAndInterest() {
        return monthlyPrincipalAndInterest;
    }

    public double getMortgageInsurance() {
        //calculate insurance
        return mortgageInsurance;
    }

    public double getEstimatedEscrow() {
        //calculate escrow
        return estimatedEscrow;
    }

    public double getEstimatedTotalMonthlyPayment() {
        return estimatedTotalMonthlyPayment;
    }

    private double calculateMonthlyPrincipalAndInterest() {
        double monthlyInterestRate = interestRate / 12.0 / 100.0; // convert annual interest rate to monthly
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -loanTerm));
        return monthlyPayment;
    }

    private double calculateEstimatedTotalMonthlyPayment() {
        return monthlyPrincipalAndInterest + mortgageInsurance + estimatedEscrow;
    }
}
