import java.util.*;
public class MortgageMarket {
    // Create a constructor to initialize MortgageMarket' objects.
    // Create a list of methods to get and retrieve MortgageMarket's information.
    // MortgageMarket usually has the following type of information:

    /*
    * Borrowers
    * Lenders
    * Properties
    * */
    
    // Initializing MortgageMarket variables
    public ArrayList<Borrower> borrowers = new ArrayList<>();
    public ArrayList<Lender> lenders = new ArrayList<>();
    public ArrayList<Property> properties = new ArrayList<>();
    
    // Default Constructor
    public MortgageMarket(){
        
    }
    
    // Methods to add MortgageMarket's information that is not included in default constructor
    public void addBorrower(Borrower borrower){
        borrowers.add(borrower);
    }
    
    public void addLender(Lender lender){
        lenders.add(lender);
    }
    
    public void addProperty(Property property){
        properties.add(property);
    }
    
    // Methods to get and retrieve MortgageMarket's info
    public ArrayList<Borrower> getBorrowers(){
        return borrowers;
    }
    
    public ArrayList<Lender> getLenders(){
        return lenders;
    }
    
    public ArrayList<Property> getProperties(){
        return properties;
    }
}
