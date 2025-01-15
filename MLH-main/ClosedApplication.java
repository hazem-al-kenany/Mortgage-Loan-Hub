    // create a constructor to initialize ClosedApplication's objects.
    // and a list of methods to get and retrieve ClosedApplication' information.
    // Including all information about ProcessedApplication,
    // ClosedApplication usually have the following type of information

/*
*
*  ClosingDisclosure
* */

// define a method to create a closing disclosure

    public class ClosedApplication extends ProcessedApplication {
    private ClosingDisclosure closingDisclosure;

    public ClosedApplication() {
        super();
    }

    public ClosingDisclosure getClosingDisclosure() {
        return closingDisclosure;
    }

    public void createClosingDisclosure() {
        LoanEstimate loanEstimate = getLoanEstimate(); //get loan estimate details
        double loanAmount = loanEstimate.getLoanAmount(); //get loan amount from loan estimate

        closingDisclosure = new ClosingDisclosure(getApplicationNumber(), "2024-04-13"); // example date

        closingDisclosure.calculateClosingCosts(loanAmount); //calculate closing costs using loan amount
    }
}