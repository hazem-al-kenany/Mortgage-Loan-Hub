import java.util.*;
public class Income {
    // Create a constructor to initialize Income's objects.
    // and create a list of methods to retrieve and get Income's information.
    // Income  usually contains the following type of information:
    /*
    *
* Base Employment Income
* Overtime
* Bonuses
* Commissions
* Dividends/Interest
* Net Rental Income
* Other
*/

// Initializing Income variables
public float baseEmploymentIncome;
public float overtime;
public float bonus;
public float commission;
public ArrayList<Float> dividendsAndInterest = new ArrayList<>();
public float netRentalIncome;
public float otherIncome;

// Default constructor
public Income(){
    
}

// Constructor to initialize Base Employment Income
public Income(float baseEmploymentIncome){
    this.baseEmploymentIncome = baseEmploymentIncome;
}

// Methods to set Income's information that is not included in default constructor
public void setBaseEmploymentIncome(float income){
    baseEmploymentIncome = income;
}

public void setOvertime(float overtime){
    this.overtime = overtime;
}

public void setBonus(float bonus){
    this.bonus = bonus;
}

public void setComission(float commission){
    this.commission = commission;
}

public void addDividendOrInterest(Float value){
    dividendsAndInterest.add(value);
}

public void setNetRentalIncome(float netRentalIncome){
    this.netRentalIncome = netRentalIncome;
}

public void setOtherIncome(float otherIncome){
    this.otherIncome = otherIncome;
}

// Methods to add new values to the already existing ones
public void addOvertime(float Overtime){
    overtime += Overtime;
}

public void addBonus(float Bonus){
    bonus += Bonus;
}

public void addCommission(float Commission){
    commission += Commission;
}

public void addNetRentalIncome(float rentalIncome){
    netRentalIncome += rentalIncome;
}

public void addOtherIncome(float other){
    otherIncome += other;
}

// Methods to retrieve and get Income's information
public float getBaseEmploymentIncome(){
    return baseEmploymentIncome;
}

public float getOvertime(){
    return overtime;
}

public float getBonus(){
    return bonus;
}

public float getCommission(){
    return commission;
}

public ArrayList<Float> getDividendsAndInterest(){
    return dividendsAndInterest; 
}

public float getNetRentalIncome(){
    return netRentalIncome;
}

public float getOtherIncome(){
    return otherIncome;
}
}
