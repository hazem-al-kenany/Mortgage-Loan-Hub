public class Lender {
    private String lenderNumber;
    private String lenderName;
    private double debtToIncomeRatio;
    private double downPaymentRequirement;
    private double interestRate;
    private double lenderFees;
    private double closingCosts;
    private int loanTerm;

    public Lender(String lenderNumber, String lenderName, double debtToIncomeRatio, 
                  double downPaymentRequirement, double interestRate, double lenderFees,
                  double closingCosts, int loanTerm) {
        this.lenderNumber = lenderNumber;
        this.lenderName = lenderName;
        this.debtToIncomeRatio = debtToIncomeRatio;
        this.downPaymentRequirement = downPaymentRequirement;
        this.interestRate = interestRate;
        this.lenderFees = lenderFees;
        this.closingCosts = closingCosts;
        this.loanTerm = loanTerm;
    }

    public String getLenderNumber() {
        return lenderNumber;
    }

    public void setLenderNumber(String lenderNumber) {
        this.lenderNumber = lenderNumber;
    }

    public String getLenderName() {
        return lenderName;
    }

    public void setLenderName(String lenderName) {
        this.lenderName = lenderName;
    }
    
    public double getDebtToIncomeRatio() {
        return debtToIncomeRatio;
    }

    public void setDebtToIncomeRatio(double debtToIncomeRatio) {
        this.debtToIncomeRatio = debtToIncomeRatio;
    }

    public double getDownPaymentRequirement() {
        return downPaymentRequirement;
    }

    public void setDownPaymentRequirement(double downPaymentRequirement) {
        this.downPaymentRequirement = downPaymentRequirement;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getLenderFees() {
        return lenderFees;
    }

    public void setLenderFees(double lenderFees) {
        this.lenderFees = lenderFees;
    }

    public double getClosingCosts() {
        return closingCosts;
    }

    public void setClosingCosts(double closingCosts) {
        this.closingCosts = closingCosts;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }
}
