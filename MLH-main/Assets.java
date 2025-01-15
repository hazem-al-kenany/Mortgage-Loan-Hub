import java.util.*;
public class Assets {
    // create a constructor to initialize Assets's objects.
    // and a list of methods to get and retrieve Assets' information.
    // Assets usually have the following type of information
    /*
    • Bank accounts (savings, checking, brokerage accounts)
   • Real property
   • Investments (stocks, bonds, retirement accounts)
   • Proceeds from the sale of your current home
   • Gifted funds from relatives (e.g. a down payment gift for an FHA loan)
*/

// Initializing Assets variables
public ArrayList<BankAccount> bankAccounts = new ArrayList<>();
public ArrayList<String> realProperties = new ArrayList<>();
public ArrayList<String> investments = new ArrayList<>();
public float proceedsFromCurrentHomeSale;
public ArrayList<String> giftedFunds = new ArrayList<>();

// Default constructor
public Assets(){
    
}

// Constructor that adds Bank Account to Bank Account ArrayList
public Assets(BankAccount bankAccount){
    bankAccounts.add(bankAccount);
}

// Methods to add Assets' information that is not included in default constructor
public void addBankAccount(BankAccount bankAccount){
    bankAccounts.add(bankAccount);
}

public void addRealProperty(String realProperty){
    realProperties.add(realProperty);
}

public void addInvesment(String investment){
    investments.add(investment);
}

public void addProceeds(float proceeds){
    proceeds = proceedsFromCurrentHomeSale;
}

public void addGiftedFunds(String GiftedFunds){
    giftedFunds.add(GiftedFunds);
}

// Methods to get and retrieve Assets' information
public ArrayList<BankAccount> getBankAccounts(){
    return bankAccounts;
}

public ArrayList<String> getRealProperties(){
    return realProperties;
}

public ArrayList<String> getinvestments(){
    return investments;
}

public float getProceeds(){
    return proceedsFromCurrentHomeSale;
}

public ArrayList<String> getGiftedFunds(){
    return giftedFunds;
}
}
