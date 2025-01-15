import java.util.*;
import java.text.SimpleDateFormat;

public class Borrower {
    // create a constructor to initialize Borrower's objects.
    // and a list of methods to get and retrieve Borrower' information.
    // Borrower usually have the following type of information
    /*
    * Borrower's Name
    * Social Security Number (SSN)
    * Home Phone
    * DOB (mm/dd/yyyy)
    * Employment
    * Income
    * Assets
    * Debts
    * Credit history
    * */
    
    // Initializing Borrower variables
    public String borrowerName;
    public String SSN;
    public String homePhone;
    public String dob;
    public SimpleDateFormat DOB = new SimpleDateFormat("MM/dd/yyyy");
    public Employment employment = new Employment();
    public Income income = new Income();
    public Assets assets = new Assets();
    public Debts debts = new Debts();
    public CreditHistory creditHistory = new CreditHistory();

    // Constructor to initialize Borrower's objects
    public Borrower(String borrowerName, String SSN, String homePhone, String dob){
        this.borrowerName = borrowerName;
        if (this.SSN.length() == 9) {
            this.SSN = SSN;
        } else{
            System.out.println("Social Security Number must be nine digits long");
        }
        
        if (this.homePhone.length() == 10) {
            this.homePhone = homePhone;
        } else{
            System.out.println("Home Phone Number must be ten digits long");
        }
    }
    
    // Method to format date to mm/dd/yyyy format
    public void DateFormat()throws Exception{
      DOB.parse(dob);
    }
    
    // Method to set Borrower Name
    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }
    
    // Methods to add Borrower's information that is not included in constructor
    public void addEmployment(Employment employment){
        this.employment = employment;
    }
    
    public void addIncome(Income income){
        this.income = income;
    }
    
    public void addAssets(Assets assets){
        this.assets = assets;
    }
    
    public void addDebts(Debts debts){
        this.debts = debts;
    }
    
    public void addCreditHistory(CreditHistory creditHistory){
        this.creditHistory = creditHistory;
    }
    
    // Methods to get and retrieve Borrower's information
    public String getBorrowerName(){
        return borrowerName;
    }
    
    public String getSocialSecurityNumber(){
        return SSN;
    }
    
    public String getHomePhone(){
        return homePhone;
    }
    
    public SimpleDateFormat getDateOfBirth(){
        return DOB;
    }
    
    public Employment getEmployment(){
        return employment;
    }
    
    public Income getIncome(){
        return income;
    }
    
    public float getIncomeFloat(){
        return income.getBaseEmploymentIncome();
    }
    
    public Assets getAssets(){
        return assets;
    }
    
    public Debts getDebts(){
        return debts;
    }
    
    public CreditHistory getCreditHistory(){
        return creditHistory;
    }
}

